package Ch7Arrays;

import java.util.Arrays;
import java.util.Scanner;

//this program adds numbers with the use of arrays
public class GabrielleDobkinSum {
    //write a method to put each number into an array
    //add arrays two at a time
    //extract numbers from arrays and adding all while multiplying what is stored in each index by 10^n
    //store that number in a...
    public static void main(String[] args) {
        Scanner input = new Scanner("G:\\My Drive\\APCS\\src\\Ch7Arrays\\InputFile");
        int[][]store = new int[1][];
        int x = 0;
        while (input.hasNextInt()){ //store each number in its own index in a 2D array
             store[0][x] = input.nextInt();
             x++;
        }
        //find the longest number in the array
        int longest = 0;
        for(int i = 0; i<store[0].length; i++){
            String test = store[0][i]+"";
            if(test.length()>longest){
                longest=test.length();
            }
        }


        int[][] additionColumn = new int[x][longest];
        for(int i = 0; i<x; i++){
            int y = 0;
            while(test>0){
                additionColumn[i][y]=test%10;
                y++;
                test=test/10;
            }
        }
        for(int i = 0; i<additionColumn.length; i++){
            System.out.println(Arrays.toString(additionColumn[i]));
        }
//        int[] sum = new int[x];
//        for(int i =0; i<additionColumn.length; i++){
//
//        }
    }
}
