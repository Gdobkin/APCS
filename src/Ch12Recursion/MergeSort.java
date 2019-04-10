package Ch12Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

    }
    public static void iterativeMergeSort(int[] a){
        int[] left = Arrays.copyOfRange(a,0,a.length/2);
        int[] right = Arrays.copyOfRange(a,a.length/2,a.length);

        iterativeMergeSort(left);
        iterativeMergeSort(right);

        merge(a,left,right);
    }
    public static void merge(int[] a,int [] left, int[] right){
        int[] resultant = new int[a.length];
        int i1 = 0;
        int i2 = 0;
        for(int i = 0; i<resultant.length; i++){
            if(i1<left.length && i2<right.length && left[i1]<right[i1]){
                resultant[i]=left[i1];
            }
        }
    }
}
