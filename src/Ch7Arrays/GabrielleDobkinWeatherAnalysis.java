package Ch7Arrays;//This is version 2 of the weather analysis project
// this version prints the weather array and states the hightest and lowest temperatures
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
/* This is my plan:
* Take user input for how many days
* Run a for loop asking for the temp each day
* Find the average and format to 1 decimal
* Run a for loop for above average day
*/
public class GabrielleDobkinWeatherAnalysis {
    public static void main(String[] args) { //creates scanner and starts running the program
        Scanner input = new Scanner(System.in);
        run(input);
    }

    public static void run(Scanner input){ //asks for user input and calls other methods
        System.out.print("How many days' temperatures? ");
        int highest = input.nextInt();
        int[] nums = new int[highest];
        double count = populate(highest,input, nums);
        double average = averageCalc(count,highest);
        System.out.println("Average temp = " + average );
        System.out.println(aboveAvgCalc(average,nums,highest) + " days were above average.");
        System.out.println("Temperatures: "+Arrays.toString(nums));
        sorting(nums);

    }
    public static void sorting(int[] nums){
        Arrays.sort(nums); //sorts the array in ascending order to find the coldest and hottest days
        System.out.println();
        System.out.println("Two coldest days: " + nums[0] + ", " + nums[1]);
        System.out.println("Two hottest days: " + nums[nums.length-1] + ", " + nums[nums.length-2]);
    }

    public static double populate (int highest, Scanner input, int[] nums){ //creates the array
        double count = 0.0;
        for(int i = 0; i<highest;i++){
            System.out.print("Day " + (i+1) + "'s high temp: " );
            nums[i]=input.nextInt();
            count+=nums[i];
        }
        return count;
    }

    public static double averageCalc(double count, int highest){ // find the average bc numbers are already in the array
        double average = count/highest;
        DecimalFormat df = new DecimalFormat("0.0"); //rounds the average to once decimal place
        average = Double.parseDouble(df.format(average));
        return average;
    }

    public static int aboveAvgCalc(double average, int[] nums, int highest){ //checks for what is higher than the average
        int aboveAvg = 0;
        for (int i = 0; i<highest ; i++){
            if (nums[i]>average){
                aboveAvg++;
            }
        }
        return aboveAvg;
    }

}
