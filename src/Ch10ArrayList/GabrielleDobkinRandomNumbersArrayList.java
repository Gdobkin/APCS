package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GabrielleDobkinRandomNumbersArrayList{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("/Users/Gaby/IdeaProjects/APCS/randomNumbers.txt"));
        ArrayList<Integer> ints = new ArrayList<>();
        int sum=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(scan.hasNextInt()){//loop handles all the needed find values except the odd removal
            int next = scan.nextInt();
            ints.add(next);
            sum+=next;
            if(next>max){
                max=next;
            }
            if(next<min){
                min=next;
            }
        }
        System.out.println(ints);
        System.out.println("Average: "+(double)(sum)/ints.size());
        System.out.println("min: "+min);
        System.out.println("max: "+max);
        for(int i = 0; i<ints.size()-1; i++){
            while(ints.get(i)%2==0){
                ints.remove(i);
            }
        }
        System.out.println(ints);
    }
}
