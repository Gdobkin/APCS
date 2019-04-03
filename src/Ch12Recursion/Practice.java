package Ch12Recursion;

public class Practice {
    public static void main(String[] args) {
        System.out.println(g(10,2));
    }
    public static int f(int x) {
        if (x <= 4) {
            return x + 4;
        } else if (x > 4 && x <= 6) {
            return f(x + 2) + 1;
        } else {
            return 2 * f(x - 3) - 3;
        }
    }

    public static int g(int x, int y){
        if(x<y){
            return x*y;
        } else if(x==y){
            return g(x+1,y-1)-1;
        } else {
            return g(x-2,y+2)+2;
        }
    }

}
