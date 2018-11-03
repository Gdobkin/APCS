package Ch7Arrays;//this program adds numbers with the use of arrays
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class GabrielleDobkinSum {
    public static int COL = 25;
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(new File(GabrielleDobkinSum.class.getResource("sum.txt").toURI()));
        int lineCount=0;
        while (input.hasNextLine()) {
            lineCount++;
            String lineScan = input.nextLine();
            String[] numbers = lineScan.split("\\s+");//backslash s is the regular expression that is used to find space and with a plus sign it finds any space
            for(int i = 0; i<numbers.length; i++){
                System.out.print(numbers[i]);
                if(i!=numbers.length-1){
                    System.out.print(" + ");
                }
            }
            int[][] addition = new int[numbers.length][COL];
            for(int i = 0; i<addition.length; i++){
                int arrayIndex = addition[i].length-1;
                for(int indexScan = numbers[i].length()-1; indexScan>=0; indexScan--){
                    addition[i][arrayIndex] = Character.getNumericValue(numbers[i].charAt(indexScan));
                    arrayIndex--;
                }
            }
            int [] result = new int[COL]; //TODO: what if sum has more spaces that col
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
        System.out.println("\nTotal lines = "+lineCount);
    }
}