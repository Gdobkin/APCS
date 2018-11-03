package Ch7Arrays;//this program adds numbers with the use of arrays
import java.io.File;

import java.util.Scanner;
public class GabrielleDobkinSum {
    private static int COL = 25;
    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(new File(GabrielleDobkinSum.class.getResource("sum.txt").toURI()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        run(input);
    }
    public static void run(Scanner input) {
        int lineCount=0;
        while (input.hasNextLine()) {
            lineCount++;
            String lineScan = input.nextLine();
            String[] numbers = lineScan.split("\\s+");//backslash s is the regular expression that is used to find space and with a plus sign it finds any space
            printNums(numbers);
            int[][] addition = new int[numbers.length][COL];
            createArrays(numbers, addition);
            int [] result = new int[COL]; //TODO: what if sum has more spaces that col
            adds(addition, result);
            printResult(result);
        }
        System.out.println("\nTotal lines = "+lineCount);
    }

    /**
     * This method adds all the numbers and stores the sums
     * @param addition - the 2D array with the numbers to be added
     * @param result - the int array where the sums of each place value will go
     */
    public static void adds(int[][] addition, int[] result) {
        int carry = 0;
        for(int j = result.length-1 ; j>=0; j--) {
            int total = 0;
            for (int i = 0; i < addition.length; i++) {
                total += addition[i][j];
            }
            total+=carry;
            result[j]=total%10;
            //TODO: what if result is more than a two digit number
            carry = total/10;
        }
    }

    /**
     * This method populates a 2D array with int arrays that will be added
     * @param numbers - input is taken from here
     * @param addition - result will be here
     */
    public static void createArrays(String[] numbers, int[][] addition) {
        for(int i = 0; i<addition.length; i++){
            int arrayIndex = addition[i].length-1;
            for(int indexScan = numbers[i].length()-1; indexScan>=0; indexScan--){
                addition[i][arrayIndex] = Character.getNumericValue(numbers[i].charAt(indexScan));
                arrayIndex--;
            }
        }
    }

    /**
     * Prints the answer of addition
     * @param result - the array that holds the sum of each place value
     */
    public static void printResult(int[] result) {
        String resulting = "";
        int count = 0;
        for(int i = 0; i<result.length; i++){
            if(result[i]==0){
                count++;
            } else{
                break;
            }
        }
        if(count == result.length){
            resulting="0";
        } else {
            for (int i = count; i < result.length; i++) {
                resulting += result[i];
            }
        }
        System.out.println(" = "+resulting);
    }

    /**
     * Prints the numbers to be added
     * @param numbers - String array with all the numbers from the line
     */
    public static void printNums(String[] numbers) {
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]);
            if(i!=numbers.length-1){
                System.out.print(" + ");
            }
        }
    }
}