package Ch12Recursion;

public class BinarySort  {
    public static void main(String[] args) {
        int[] practice = {-20,-2,0,1,3,6,10};
        System.out.println(binarySearch(practice,1));

    }
    public static int binarySearch(int[] x, int target){
        int min = 0;
        int max = x.length-1;
        int mid = (min+max)/2;
        if(x[mid]<target){
            max=mid-1;
            mid = (min+max)/2;
        } else if(x[mid]>target){
            min=mid+1;
            mid = (min+max)/2;
        } else if (x[mid]==target){
            return mid;
        }
        return -1;
    }

}
