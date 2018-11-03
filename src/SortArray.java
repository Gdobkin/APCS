package Ch7Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String [] args){
        int [] array = new int[] {11, 42, -5, 27, 0, 89};
        michelleMatthewAlgo(array);

    }
    public static void oliverAlgo(int [] array){
        int [] swapped = new int[array.length];
        for(int i = 0; i<array.length; i++){
            swapped[i] = array[array.length-1-i];
        }
        System.out.println(Arrays.toString(swapped));
    }
    public static void michelleMatthewAlgo(int array[]){
        int temp;
        for(int i = 0; i <=array.length/2; i++){
            temp = array[i];
            array [i] = array[array.length-i-1];
            array [array.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
