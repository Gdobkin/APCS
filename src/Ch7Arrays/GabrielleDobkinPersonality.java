package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
//This program reads input from a file and calculates your personality type based on survey results
public class GabrielleDobkinPersonality {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input file name: ");
        PrintStream output = null;
        try {
            output = new PrintStream("output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        run(userInput, output);
    }

    /**
     * This method runs the program. It can be called in the main method multiple times
     * @param userInput - the scanner containing user input
     * @param output - the printstream file
     */
    public static void run(Scanner userInput, PrintStream output) throws FileNotFoundException {
        String fileName = userInput.next();
        File file = new File(fileName);
        while(!file.exists()){
            System.out.print("File not found. Try again: ");
            run(userInput, output);
            return;
        }
        Scanner input = new Scanner(file);//TODO make work for school: move file out of src
        int countInputLine = 0;
        while(input.hasNextLine()){
            countInputLine++;
            eachLineInput(output, input, countInputLine);
        }
    }

    /**
     * This method runs the program for each line of input
     * @param output - printstream file
     * @param input - scanner with the text
     * @param countInputLine - the int storing which line it is
     */
    public static void eachLineInput(PrintStream output, Scanner input, int countInputLine) {
        if (countInputLine % 2 != 0) {
            output.println(input.nextLine() + ":");
        } else {
            int chars = 0;
            int[] answers = new int[8];
            String lineScan = input.nextLine();
            int quesNum = 1;
            while (chars < 70) {
                char answerLetter = lineScan.toLowerCase().charAt(chars);
                fillAnswer(answers, quesNum, answerLetter);
                quesNum = getQuesNum(quesNum);
                chars++;
            }
            int[] percents = new int[4];
            printstreamAsToBs(output, answers);
            createPercentsArray(answers, percents);
            String[] percentWithSign = new String[percents.length];
            printstreamPercents(output, percents, percentWithSign);
            String[] type = new String[4];
            calculateAndPrintType(output, percents, type);
        }
    }

    /**
     * This method calculates the personality type and adds it to printstream file
     * @param output - printstream file
     * @param percents - array with percents to find if percent of B is bigger or smaller than 50 for personality type
     * @param type - array populated with 4 personality type letters
     */
    public static void calculateAndPrintType(PrintStream output, int[] percents, String[] type) {
        String[] a = {"E", "S", "T", "J"};
        String[] b = {"I", "N", "F", "P"};
        for (int i = 0; i < percents.length; i++) {
            int test = percents[i];
            if (test > 50) {
                type[i] = b[i];
            } else if (test < 50) {
                type[i] = a[i];
            } else {
                type[i] = "X";
            }
        }
        for (int i = 0; i < type.length; i++) {
            output.print(type[i]);
        }
        output.println();
        output.println();
    }

    /**
     * This method adds the percents of B to the printstream file
     * @param output - printstream file
     * @param percents - array of percents
     * @param percentWithSign - string array that takes percent and adds the % character
     */
    public static void printstreamPercents(PrintStream output, int[] percents, String[] percentWithSign) {
        for(int i =0; i<percentWithSign.length; i++){
            percentWithSign[i]=percents[i]+"%";
        }
        output.print(Arrays.toString(percentWithSign) + " = ");
    }

    /**
     * This method takes the number of A and B answers and finds the percent of Bs which will be use to calculate personality
     * @param answers - array with answers
     * @param percents - array being populated
     */
    public static void createPercentsArray(int[] answers, int[] percents) {
        int percentsIndex = 0;
        for (int i = 0; i < answers.length; i += 2) {
            percents[percentsIndex]=(int)((double)(answers[i])/(answers[i]+answers[i+1])*100);
            percentsIndex++;
        }
    }

    /**
     * This method adds the ratio of As to Bs into the printstream file
     * @param output - the printstream file name
     * @param answers - the array where the numbers of A and B are stored
     */
    public static void printstreamAsToBs(PrintStream output, int[] answers) {
        for(int i = 0; i<answers.length; i+=2){
            output.print(answers[i+1]+"A-"+answers[i]+"B ");
        }
        output.println();
    }

    /**
     * This method updates the question number that the line is on:
     * each imput line has 10 sets of 7 questions and quesNum goes from 1-7 and back to one to follow this
     * @param quesNum - updates the variable for which question the line is on
     * @return - returns the new question number
     */
    public static int getQuesNum(int quesNum) {
        if(quesNum<7){
            quesNum++;
        } else{
            quesNum=1;
        }
        return quesNum;
    }

    /**
     * This method takes one letter at a time from the input line and sorts it in the answer array appropriately
     * @param answers - the int array that is being filled with the number of answers of each letter
     * @param quesNum - the question number out of 7 that it is on in the respective group of 10
     * @param answerLetter - the answer that is being counted
     */
    public static void fillAnswer(int[] answers, int quesNum, char answerLetter) {
        if (answerLetter != 'a' && answerLetter != 'b') {
            return;
        }
        switch(quesNum){
            case 1:
                answers['b'-answerLetter]++; //if it is b then b-b=0, it it is a then b-a=1
                break;
            case 2:
            case 3:
                answers['b'-answerLetter+2]++;//same logic with offset
                break;
            case 4:
            case 5:
                answers['b'-answerLetter+4]++;
                break;
            case 6:
            case 7:
                answers['b'-answerLetter+6]++;
                break;
        }
    }
}