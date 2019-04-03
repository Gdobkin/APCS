package Ch12Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }

    public static int iterativeFactorial(int x){
        int count = 1;
        for(int i = x; i>0; i--){
            count*=i;
        }
        return count;
    }

    public static int recursiveFactorial(int n){
        if (n == 0) {
            return 1;
        } else{
            return recursiveFactorial(n-1)*n;
        }
    }

    public static void printStars(int n){
        if(n==0){
            System.out.println();
        } else{
            System.out.print("*");
            printStars(n-1);
        }
    }

    public static int pow(int base, int power){
        if(power==0){
            return 1;
        } else {
            return pow(base,power-1)*base;
        }
    }
}
