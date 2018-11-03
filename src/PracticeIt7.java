import java.util.Arrays;
import java.util.Scanner;

public class PracticeIt7 {
    public static void main(String[] args) {
        int[][]a={{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int[][]b = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        System.out.println(isMagicSquare(a));
    }
    public static int longestSortedSequence(int[] a){
        int longestSequence=0;
        int currentRun =1;
        for(int i = 0; i<a.length-1; i++){
            if(a[i]<=a[i+1]&&a[i+1]!=a.length-1){
                currentRun++;
            } else if(a[i]<=a[i+1]&&a[i+1]==a.length-1){
                currentRun+=2;
            }else{
                if(currentRun>longestSequence){
                    longestSequence=currentRun;
                }
                currentRun=1;
            }
        }
        if(a.length>0&&currentRun>longestSequence){
            longestSequence=currentRun;
        }
        return longestSequence;
    }
    public static boolean contains(int[] a1, int[] a2){
        for(int i = 0; i<a1.length; i++) {
            int remainingA1 = a1.length - i;
            if (remainingA1 < a2.length) {
                return false;
            }
            if (a1[i] == a2[0]) {
                int count = 0;
                for (int j=0;j < a2.length; j++) {
                    if (a1[i + j] != a2[j]) {
                        break;
                    } else{
                        count++;
                    }
                }
                if(count==a2.length)
                    return true;
            }
        }
        return false;
    }
    public static int[] collapse(int[] arr){
        int[] collapsed = new int[arr.length/2+1];
        int x =0;
        for(int i = 0; i<arr.length-1; i+=2){
            collapsed[x]=arr[i]+arr[i+1];
            x++;
        }
        return collapsed;
    }
    public static void wordLengths(Scanner fileScan){
        int[] tally = new int[81];
        while(fileScan.hasNext()){
            String test = fileScan.next();
            tally[test.length()]++;
        }
        for (int i = 0; i<tally.length; i++){
            if(tally[i]>0){
                System.out.print(i+": " +tally[i]+"\t");
                for (int j = 0; j<tally[i]; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    public static int[][] matrixAdd(int[][] A, int[][] B) {
        int [][] C = new int[A.length][];
        for(int rows=0; rows<A.length; rows++){
            C[rows]=new int[A[rows].length];
            for(int col=0; col<A[0].length; col++){
                C[rows][col]=A[rows][col]+B[rows][col];
            }
        }
        return C;
    }
    /*Write a method called isMagicSquare that accepts a two-dimensional array of integers as a parameter
     and returns true if it is a magic square. A square matrix is a magic square if it is square in shape
     (same number of rows as columns, and every row the same length), and all of its row, column, and diagonal sums are equal.
      For example, [[2, 7, 6], [9, 5, 1], [4, 3, 8]] is a magic square because all eight of the sums are exactly 15.*/
    public static boolean isMagicSquare(int[][] a){
        if(a.length==0){
            return true;
        }
        int diag = 0;
        int invDiag = 0;
        int[] rowSum = new int[a.length];
        int[] colSum = new int[a.length];
        for(int row = 0; row<a.length; row++){
            if(a[row].length!=a.length){
                return false;
            }
            for(int col = 0; col<a[row].length; col++) {
                rowSum[row] += a[row][col];
                colSum[col] += a[row][col];
                if(row==col){
                    diag+=a[row][col];
                }
                if (row+col==a.length-1){
                    invDiag+=a[row][col];
                }
            }
        }
        int magicNum = rowSum[0];
        if(diag!=invDiag ||diag!=magicNum){
            return false;
        }
        for(int i = 0; i<rowSum.length; i++){
            if(rowSum[i]!=colSum[i] || rowSum[i]!=magicNum){
                return false;
            }
        }
        return true;
    }

}
