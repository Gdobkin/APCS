package Ch7Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String [] args){
        int [] array = new int[] {11, 42, -5, 27, 0, 89};
        oliverAlgo(array);

    }
    public static void oliverAlgo(int [] array){
        int [] swapped = new int[array.length];
        for(int i = 0; i<array.length; i++){
            swapped[i] = array[array.length-1-i];
        }
        System.out.println(Arrays.toString(swapped));
    }
    public static void michelleMatthewAlgo(int array[]){

    }
}
