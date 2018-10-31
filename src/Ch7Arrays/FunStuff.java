package Ch7Arrays;

public class FunStuff {
    public static void main(String[] args) {
        //int[][] augmented = new int[3][4];
        /*augmented[1][1]=1;
        augmented[1][2]=-3;
        augmented[1][3]=2;
        augmented[1][4]=12;
        augmented[2][1]=2;
        augmented[2][2]=-5;
        augmented[2][3]=5;
        augmented[2][4]=14;
        augmented[3][1]=1;
        augmented[3][2]=-2;
        augmented[3][3]=3;
        augmented[3][4]=20;
        solveAugmentedMatrix(augmented);*/
        int [] arr = {2,4,6};
        System.out.println(longestSortedSequence(arr));
    }
    public static int[][] solveAugmentedMatrix(int[][] matrix){

        return matrix;
    }
    public static int longestSortedSequence(int[] arr){
        int count = 0;
        int maxCount = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>=arr[i-1]){
                count++;
            } else{
                if(count>maxCount){
                    maxCount=count;
                }
                count = 0;
            }
        }
        return maxCount;
    }
}
