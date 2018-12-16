package ACSL;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GabrielleDobkinACSLC1V1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("ACSL1.txt"));
        while(input.hasNextLine()){
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);
            String value = lineScan.next();
            char[] separate = new char[value.length()];
            int x = 0;
            for(int i = 0; i<value.length(); i++) {
                separate[x] = value.charAt(i);
                x++;
            }
            int chunk = lineScan.nextInt();
            long cumsum = 0;
            int i = separate.length-chunk+1;
            int j = 0;
            int k = 0;
            while(k<i){
                int z = 0;
                String tempNum = "";
                while(z<chunk) {
                    tempNum = tempNum + separate[j + z];
                    z++;
                }
                cumsum+=Long.parseLong(tempNum);
                j++;
                k++;
            }
            System.out.println(cumsum);
        }
    }
}
