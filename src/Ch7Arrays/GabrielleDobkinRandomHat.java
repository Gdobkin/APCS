package Ch7Arrays;

// this program picks two numbers between 1 and 8 four times with no repeats
public class GabrielleDobkinRandomHat {
    public static void main(String[] args) {
        int[] teams = new int[8];
        for (int i = 1; i<=8; i++){ //populates an array with all of the teams
            teams[i-1] = i;
        }
        int[] used = new int[8]; // creates a blank array that will later hold used teams, it's blank now because no team has been used yet
        int unusedIndex = 0; //keeps track of the lowest empty index in the unused array
        while(used[7]==0) { //repeat while the last number of the unused array is empty (not all the teams have been picked)
            boolean done = false; //checks if a good number is found
            int team1= 0; // each iteration a different team 1 and 2 will be chosen
            int team2 = 0;

            while(!done) { //generates a random number and checks to see if it is in any of the unused array's indexes
                team1 = (int) (Math.random() * 8 + 1);
                int check = 0;
                for(int i = 0; i<8;i++) {
                    if (!(team1 == used[i])) {
                        check++;
                    }
                }
                if(check==8){
                    done = true;
                }

            }

            for (int i = 0; i < 8; i++) { //updates unused array
                if (teams[i] == team1) {
                    used[unusedIndex] = team1;
                    unusedIndex++;
                }
            }

            done = false; //resets done and finds team 2
            while(!done) {
                team2 = (int) (Math.random() * 8 + 1);
                int check = 0;
                for(int i = 0; i<8;i++) {
                    if (!(team2 == used[i])) {
                        check++;
                    }
                }
                if(check==8){
                    done = true;
                }
            }

            for (int i = 0; i < 8; i++) {
                if (teams[i] == team2) {
                    used[unusedIndex] = team2;
                    unusedIndex++;
                }
            }
            System.out.println(team1 + " "+ team2); //prints teams
        }
    }
}