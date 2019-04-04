package Ch12Recursion;

public class BinarySort  {
    public static void main(String[] args) {
        int[] practice = {-20,-2,0,1,3,6,10};
        System.out.println(recursiveBinarySearch(practice,6,0,practice.length-1));

    }
    public static int binarySearch(int[] x, int target){
        int min = 0;
        int max = x.length-1;
        int mid = (min+max)/2;
        while(min<=max) {
            if (x[mid] > target) {
                max = mid - 1;
                mid = (min + max) / 2;
            } else if (x[mid] < target) {
                min = mid + 1;
                mid = (min + max) / 2;
            } else if (x[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] x, int target, int min, int max){
        int mid = (max+min)/2;
        if(max<min){
            return -1;
        }
        if(target<x[mid]){
            return recursiveBinarySearch(x, target, min, max - 1);
        } else if (target>x[mid]){
            return recursiveBinarySearch(x,target,mid+1, max);
        } else if(target==x[mid]){
            return mid;
        }
        return -1;
    }

}
