package Ch7Arrays;
import java.util.Scanner;
//this program asks for a number a teams participating in a tournament and matches up the first round with no repeats
public class GabrielleDobkinRandomHatV2 {
    private static int unusedIndex =0; //a method can't return two numbers so this is updated universally
    public static void main(String[] args) {
        run(); //run can be called many times for different situations
    }
    public static void run(){ //method with scanner and print statement
        Scanner scan = new Scanner(System.in);
        System.out.print("How many teams are competing? ");
        int numTeams = scan.nextInt(); //gets number of teams competing
        if(numTeams%2==0 && numTeams>0){//checks if the input is valid
            int[] teams = new int[numTeams]; //populates an array with all of the teams
            for (int i = 1; i<=numTeams; i++){
                teams[i-1] = i;
            }
            int[] used = new int[numTeams]; //creates a blank array that will be used to store teams already picked
            unusedIndex = 0;
            while(used[numTeams-1]==0) { //find matches and prints matches. repeats based on number of teams
                int team1= pick(numTeams, used, teams);
                int team2 = pick(numTeams, used, teams);

                System.out.println("Team "+team1 + " versus team "+ team2);
            }
        } else{
            System.out.println("Invalid input must be an even number greater than zero.");
            run();
        }
    }
    public static int pick(int numTeams, int[] used, int[] teams){//finds and returns matches
        boolean done = false; //checks if an unused team has been found
        int team = 0; //the team number that will be returned
        while(!done) { //while loop is used because number of repeats is unknown
            team = (int) (Math.random() * numTeams + 1);//picks random team
            int check = 0; //checks if that team has been used
            for(int i = 0; i<numTeams;i++) {
                if (!(team == used[i])) {
                    check++;
                }
            }
            if(check==numTeams){//it it's unused it's all good, otherwise repeat
                done = true;
            }
        }
        for (int i = 0; i < numTeams; i++) {//once a team has been found it is marked that it shouldn't be reused
            if (teams[i] == team) {
                used[unusedIndex] = team;
                unusedIndex++;
            }
        }
        return team;
    }
}