import java.text.DecimalFormat;
import java.util.Scanner;


    public class Main {
        public static void main(String [] args) {
            user();
        }
        public static void user() {
            // asks for user input
            Scanner input = new Scanner(System.in);
            int count = 0;
            System.out.print("How many days' temperatures? ");
            int highestTemp = input.nextInt();
            arrayDec(highestTemp, count, input); // calls the next method
        }


        public static void arrayDec(int highest, double count, Scanner input) {
            // declaring the array
            int [] temps = new int [highest];
            String tempString = "";
            // repeats what's inside the fore loop until it reaches what the user input typed in
            for(int i = 0; i < highest; i++){
                System.out.print("Day " + (i+1) + "'s high temp: ");
                int answer = input.nextInt();
                tempString += answer;
                if(i < highest - 1){
                    tempString += ", ";
                }

                temps[i] = answer; // puts what the user answered into the array
                count += answer; // adds to the cumulative sum variable to later find average
            }
            average(count, highest, temps, tempString); // calls next method
        }


        public static void average(double count, int highest, int[] temps, String tempString) {
            // finding average
            double average = count / highest;
            //rounding to nearest tenth
            DecimalFormat df = new DecimalFormat("##.0");
            average = Double.parseDouble(df.format(average));
            // prints average
            System.out.println("Average temp = " + average);
            // cumulative sum for the amount of terms that are above the average
            int HowManyAboveAvg = 0;
            // if the number in the array is higher than average, increase the new cumulative sum variable
            for (int i = 0; i < highest; i++) {
                if (temps[i] > average) {
                    HowManyAboveAvg++;
                }
            }

            System.out.println(HowManyAboveAvg + " days were above average.");
            System.out.println("");

            printArray(tempString);
            sortInput(temps, highest);
        }

        // prints all the temperatures
        public static void printArray(String tempString) {
            System.out.println("Temperature: [" + tempString + "]");
        }

        // calculates and prints min and max temps
        public static void sortInput(int[] temps, int highest){

            // declares variables
            int coldest = temps[0];
            int secondColdest = temps[highest-1];
            int hottest = temps[0];
            int secondHottest = temps[highest-1];

            // goes through all the user inputs and compares the data to see which is coldest, second coldest, etc
            for(int i = 1; i < highest; i++){
                if(temps[i] < coldest){
                    secondColdest = coldest;
                    coldest = temps[i];
                }else if(temps[i] < secondColdest){
                    secondColdest = temps [i];
                }

                if(temps[i] > hottest){
                    secondHottest = hottest;
                    hottest = temps[i];
                } else if (temps[i] > secondHottest){
                    secondHottest = temps[i];
                }
            }
            // prints results
            System.out.println("Two coldest days: "+ coldest + ", " + secondColdest);
            System.out.println("Two hottest days: "+ hottest + ", " + secondHottest);
        }
    }




