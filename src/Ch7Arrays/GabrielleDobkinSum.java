package Ch7Arrays;//this program adds numbers with the use of arrays
import java.io.File;
import java.util.Scanner;

public class GabrielleDobkinSum {//with the extra credit
    public static void main(String[] args) {
        try { //the try catch is there to prevent the program from crashing
            Scanner input = new Scanner(new File(GabrielleDobkinSum.class.getResource("sum.txt").toURI()));
            //helps read file from the directory where the class is (so the project can work at school) I looked it up online
            run(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * This method runs the program and calls all of the methods
     * @param input - this is the file
     */
    public static void run(Scanner input) {
        int lineCount=0;
        while (input.hasNextLine()) {
            lineCount++;
            String lineScan = input.nextLine();
            String[] numbers = lineScan.split("\\s+");//backslash s is the regular expression that is used to find space and with a plus sign it finds any space
            printNums(numbers);
            int longest = 0;
            for(int i = 0; i<numbers.length;i++){
                if(numbers[i].length()>longest){
                    longest=numbers[i].length();
                }
            }
            int[][] addition = new int[numbers.length][longest];
            createArrays(numbers, addition);
            int [] result = new int[longest]; //TODO: what if sum has more spaces that col
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
        int count = 0;//index of the first non zero integer
        for(int i = 0; i<result.length; i++){ //this is so there is no leading zeros
            if(result[i]==0){//finds the first index that isn't a zero
                count++;
            } else{//when the index is not a zero, stop the loop and start the next one at that index
                break;
            }
        }
        if(count == result.length){//if all the numbers are zero, the sum is zero
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