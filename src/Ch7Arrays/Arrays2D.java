package Ch7Arrays;
//this program prints a multiplication table of the numbers 1 thru five
public class Arrays2D {
    public static void main(String[] args) {
        int[][] table = new int[5][10];
        for(int row = 0; row<table.length; row++){
            for(int col = 0; col<table[row].length; col++){
                table[row][col]=(row+1)*(col+1);
            }
        }
        for(int row = 0; row<table.length; row++){
            for(int col=0; col<table[row].length; col++){
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
