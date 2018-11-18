package Ch7Arrays;

import java.util.Arrays;

/*
Write a method
public static boolean isLatin(int[][] a)
that checks to see if the array is a Latin square. This means that it must be square (suppose it is n x n), and that each row and each column must contain the values 1, 2, ..., n with no repeats.
Some helper methods you may need for this example and the next are suggested in the tester code. Uncomment and run these tests if you implement these helper methods.

Write a method
public static boolean isSequence(int[][] a)
that checks to see if the array is square (suppose it is n x n), and contains each of the digits from 1 to n*n, eg. 1, 2, ..., 16 for a 4 x 4 array.
* */
public class TwoDPrac {
    public static void main(String[] args) {
        int[][] basic = new int[][] { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] negatives = new int[][] { {1,-2,3}, {4,5,6}, {-7,8,-9} };
        int[][] rowmagic = new int[][] { {1,2,3}, {-1,5,2}, {4,0,2} };
        int[][] colmagic = new int[][] { {1,-1,4,10}, {3,5,0,-6} };
        int[][] latin = new int[][] { {1,2,3}, {2,3,1}, {3,1,2} };
        int[][] notlatin = new int[][] { {2,1,3}, {2,3,1}, {3,1,2} };
        int[][] magic = new int[][] { {2,2,2}, {2,2,2}, {2,2,2}   };
        int[][] magic2 = new int[][] {{}};
        int[][] notmagic1 = new int[][] { {1,2,3}, {4,5,6}, {6,8,9} }; //diag sums are not equal
        int[][] notmagic2 = new int[][] { {1,5,3}, {4,5,6}, {7,8,9} }; //diag sums are equal but rows are not
        System.out.println(isMagic(magic2));
    }
    public static int maxValue(int[][] a){
        /*Write a method
        public static int max(int[][] a)
        that returns the maximum value in the 2d parameter array a.*/
        int max = Integer.MIN_VALUE;
        for(int row = 0; row<a.length; row++){
            for(int col = 0; col<a[row].length; col++){
                if(a[row][col]>max){
                    max = a[row][col];
                }
            }
        }
        return max;
    }
    public static int rowSum(int[][] a, int x){
        /*Write a method
public static int rowSum(int[][] a, int x)
that returns the sum of the elements in Row x of a.*/
        int sum = 0;
        for(int i = 0; i<a[x-1].length; i++){
            sum+=a[x-1][i];
        }
        return sum;
    }
    public static int columnSum(int[][] a, int x){
        /*Write a method
public static int columnSum(int[][] a, int x)
that returns the sum of the elements in Column x of a (careful with rows of different lengths!).*/
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum+=a[i][x-1];
        }
        return sum;
    }
    public static int[] allRowSums(int[][] a){
        /*Write a method
        public static int[] allRowSums(int[][] a)
        that calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
        */
        int[] sums = new int[a.length];
        for(int row = 0; row<a.length; row++){
            for(int col = 0; col<a[row].length; col++){
                sums[row]+=a[row][col];
            }
        }
        return sums;
    }
    public static boolean isRowMagic(int[][] a){
        /*Write a method
        public static boolean isRowMagic(int[][] a)
        that checks if the array is row-magic (this means that every row has the same row sum).*/
        int[] sums = new int[a.length];
        for(int row = 0; row<a.length; row++){
            for(int col = 0; col<a[row].length; col++){
                sums[row]+=a[row][col];
            }
        }
        for(int i = 0; i<sums.length-1; i++){
            if(sums[i]!=sums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isColumnMagic(int[][] a){
        /*Write a method
        public static boolean isColumnMagic(int[][] a)
        that checks if the array is column-magic (this means that every column has the same column sum).*/
        int[] colSum = new int[a.length];
        for(int row = 0; row<a.length; row++){
            for(int col=0; col<a[row].length; col++){
                colSum[col]+=a[row][col];
            }
        }
        for(int i = 0; i<a.length-1; i++){
            if(colSum[i]!=colSum[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isSquare (int[][] a){
        /*Write a method
        public static boolean isSquare(int[][] a)
        that checks if the array is square (i.e. every row has the same length as a itself).*/
        for(int i = 0; i<a.length; i++){
            if(a.length!=a[i].length){
                return false;
            }
        }
        return true;
    }
    /*Write a method
public static boolean isMagic(int[][] a)
that checks if the array is a magic square.
This means that it must be square, and that all row sums, all column sums, and the two diagonal-sums must all be equal.
*/
    public static boolean isMagic(int[][] a){
        //check if empty
        if(a.length==0){
            return true;
        }
        //check if square
        for(int i = 0; i<a.length; i++){
            if(a.length!=a[i].length){
                return false;
            }
        }
        //check if row sums equal
        int[] sums = new int[a.length];
        for(int row = 0; row<a.length; row++){
            for(int col = 0; col<a[row].length; col++){
                sums[row]+=a[row][col];
            }
        }
        for(int i = 0; i<sums.length-1; i++){
            if(sums[i]!=sums[i+1]){
                return false;
            }
        }
        //check if col sums equal
        int[] colSum = new int[a.length];
        for(int row = 0; row<a.length; row++){
            for(int col=0; col<a[row].length; col++){
                colSum[col]+=a[row][col];
            }
        }
        for(int i = 0; i<a.length-1; i++){
            if(colSum[i]!=colSum[i+1]){
                return false;
            }
        }
        //check if diagonal sums equal
        int goodDiag = 0;
        for(int row = 0; row<a.length; row++){
            for(int col=0; col<a[row].length; col++){
                if(row==col){
                    goodDiag+=a[row][col];
                }
            }
        }
        int badDiag = 0;
        int colIndex = a.length-1;
        for (int row = 0; row<a.length; row++){
            for(int col = 0; col<a[row].length; col++){
                if(col==colIndex){
                    badDiag+=a[row][col];
                    colIndex--;
                }
            }
        }
        if(goodDiag!=badDiag){
            return false;
        }
        //check if all are equal
        if(sums[0]!=colSum[0]||sums[0]!=goodDiag){
            return false;
        }
        return true;
    }
}
