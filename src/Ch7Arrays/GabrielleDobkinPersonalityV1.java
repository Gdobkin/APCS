package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class GabrielleDobkinPersonalityV1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input file name: ");
        run(userInput);
    }
    public static void run(Scanner userInput) throws FileNotFoundException {
        String fileName = userInput.next();
        PrintStream output = new PrintStream("output.txt");
        Scanner input = null;
        try { // this is to restart the program every time a wrong file is inputted
            input = new Scanner(new File(fileName));//TODO make work for school: move file out of src
        } catch (Exception e) {
            output.print("File not found. Try again: ");
            run(userInput);
        }
        int countInputLine = 0;
        while(input.hasNextLine()){
            countInputLine++;
            if (countInputLine % 2 != 0) {
                output.println(input.nextLine() + ":");
            } else {
                int chars = 0;
                int[] answers = new int[8];
                String lineScan = input.nextLine();
                int quesNum = 1;
                while (chars < 70) {
                    char answerLetter = lineScan.toLowerCase().charAt(chars);
                    if (quesNum == 1) {
                        if (answerLetter == 'b') {
                            answers[0]++;
                        } else if (answerLetter == 'a') {
                            answers[1]++;
                        }
                    } else if (quesNum == 2 || quesNum == 3) {
                        if (answerLetter == 'b') {
                            answers[2]++;
                        } else if (answerLetter == 'a') {
                            answers[3]++;
                        }
                    } else if (quesNum == 4 || quesNum == 5) {
                        if (answerLetter == 'b') {
                            answers[4]++;
                        } else if (answerLetter == 'a') {
                            answers[5]++;
                        }
                    } else if (quesNum == 6 || quesNum == 7) {
                        if (answerLetter == 'b') {
                            answers[6]++;
                        } else if (answerLetter == 'a') {
                            answers[7]++;
                        }
                    }
                    if(quesNum<7){
                        quesNum++;
                    } else{
                        quesNum=1;
                    }
                    chars++;
                }
                int[] percents = new int[4];
                for(int i = 0; i<answers.length; i+=2){
                    output.print(answers[i+1]+"A-"+answers[i]+"B ");
                }
                output.println();
                int percentsIndex = 0;
                for (int i = 0; i < answers.length; i += 2) {
                    percents[percentsIndex]=(int)((double)(answers[i])/(answers[i]+answers[i+1])*100);
                    percentsIndex++;
                }
                String[] percentWithSign = new String[percents.length];
                for(int i =0; i<percentWithSign.length; i++){
                    percentWithSign[i]=percents[i]+"%";
                }
                output.print(Arrays.toString(percentWithSign) + " = ");
                String[] a = {"E", "S", "T", "J"};
                String[] b = {"I", "N", "F", "P"};
                String[] type = new String[4];
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
        }
    }
}