package Ch7Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

    /*
    * Take user input for how many days
    * Run a for loop asking for the temp each day
    * Find the average and format to 1 decimal
    * Run a for loop for above average day
    */
    public class WeatherAnalysisV2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            run(input);
        }
        public static void run(Scanner input){
            double count = 0.0;
            System.out.print("How many days' temperatures? ");
            int highest = input.nextInt();
            int[] nums = new int[highest];
            for(int i = 0; i<highest;i++){ //creates the array
                System.out.print("Day " + (i+1) + "'s high temp: " );
                nums[i]=input.nextInt();
                count+=nums[i];
            }
            // find the average bc numbers are already in the array
            double average = count/highest;
            DecimalFormat df = new DecimalFormat("0.0"); //rounds the average to once decimal place
            average = Double.parseDouble(df.format(average));
            System.out.println("Average temp = " + average );
            int aboveAvg = 0;
            for (int i = 0; i<highest ; i++){ //checks for what is higher than the average
                if (nums[i]>average){
                    aboveAvg++;
                }
            }
            System.out.println(aboveAvg + " days were above average.");
        }

    }
