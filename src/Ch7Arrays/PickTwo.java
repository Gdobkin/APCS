package Ch7Arrays;

public class PickTwo {
    public static void main(String[] args) {
        int[] teams = new int[8];
        for (int i = 1; i<=8; i++){
            teams[i-1] = i;
        }
        int[] used = new int[8];
        int unusedIndex = 0;
        while(used[7]==0) {
            boolean done = false;
            int team1= 0;
            int team2 = 0;

            while(!done) {
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

            for (int i = 0; i < 8; i++) {
                if (teams[i] == team1) {
                    used[unusedIndex] = team1;
                    unusedIndex++;
                }
            }

            done = false;
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
            System.out.println(team1 + " "+ team2);
        }
    }
}
