package ACSL;

import java.util.Scanner;

public class GabyDobkinACSLC3 {
    public static void main(String[] args) {
        for(int w = 1; w<6; w++) {
            //givens
            Scanner userInput = new Scanner(System.in);
            int r = userInput.nextInt();
            int c = userInput.nextInt();
            int startingPosition = userInput.nextInt();
            int numBlocked = userInput.nextInt();
            int[] blocked = new int[numBlocked];
            for (int i = 0; i < numBlocked; i++) {
                blocked[i] = userInput.nextInt();
            }


            int[][] grid = new int[r][c];
            boolean direction;
            String output = "";

            for (int i = 0; i < numBlocked; i++) {
                int[] blockIt = coordinates(grid, blocked[i]);
                grid[blockIt[0]][blockIt[1]] = -1;
            }
            int[] startCoordinates = coordinates(grid, startingPosition);
            int row = startCoordinates[0];
            int col = startCoordinates[1];

            if (col == 0) {
                direction = true;
            } else {
                direction = false;
            }

            int nextPiece = 0;
            int strikes = 0;

            while (strikes < 3) {
                if (nextPiece == 0) {
                    if (Aok(grid, row, col, direction)) {
                        output += "A";
                        strikes = 0;
                        if (direction) {
                            col += 3;
                        } else {
                            col -= 3;
                        }
                    } else {
                        strikes++;
                    }
                    nextPiece++;
                    nextPiece %= 3;
                } else if (nextPiece == 1) {
                    if (Bok(grid, row, col, direction)) {
                        output += "B";
                        strikes = 0;
                        if (direction) {
                            row += 1;
                            col += 2;
                        } else {
                            row -= 1;
                            col -= 2;
                        }
                    } else {
                        strikes++;
                    }
                    nextPiece++;
                    nextPiece %= 3;
                } else if (nextPiece == 2) {
                    if (COk(grid, row, col, direction)) {
                        output += "C";
                        strikes = 0;
                        if (direction) {
                            col += 2;
                            row += 2;
                        } else {
                            col -= 2;
                            row -= 2;
                        }
                    } else {
                        strikes++;
                    }
                    nextPiece++;
                    nextPiece %= 3;
                }
            }
            if (direction) {
                System.out.println(output);
            } else {
                for (int i = output.length() - 1; i >= 0; i--) {
                    System.out.print(output.charAt(i));
                }
                System.out.println();
            }
        }
    }
    public static int[] coordinates(int[][] grid, int location){
        int count = 0;
        int[] toReturn = new int[2];
        for(int row = 0; row<grid.length; row++){
            for(int column = 0; column<grid[row].length; column++){
                count++;
                if(count == location){
                    toReturn[0] = row;
                    toReturn[1] = column;
                    return toReturn;
                }
            }
        }
        throw new RuntimeException("Unable to find location " + location);
    }
    public static void printGrid(int[][] grid){
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean Aok(int[][] grid, int row, int col, boolean direction){
        //System.out.println("Trying A row="+row+" col="+col+" dir="+direction);
        if(direction) {
            if (grid[0].length > col + 2) {
                if (grid[row][col + 1] != -1 && grid[row][col + 2] != -1 && grid[row][col] != -1) {
                    return true;
                }
            }
        } else{
            if (0 <= col - 2) {
                if (grid[row][col] != -1 && grid[row][col - 1] != -1 && grid[row][col - 2] != -1) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean Bok(int[][] grid, int row, int col, boolean direction){
        //System.out.println("Trying B row="+row+" col="+col+" dir="+direction);
        if(direction){
            if(grid[0].length > col+1 && grid.length >  row+1){
                if ((grid[row][col] != -1 &&grid[row + 1][col+1] != -1 && grid[row +1 ][col] != -1)) {
                    return true;
                }
            }
        } else{
            if(0 <=  col-1 && 0 <=  row-1){
                if ((grid[row][col] != -1 &&grid[row - 1][col-1] != -1 && grid[row][col-1] != -1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean COk(int[][] grid, int row, int col, boolean direction){
        //System.out.println("Trying C row="+row+" col="+col+" dir="+direction);
        if(direction){
            if(grid[0].length > col+1 && grid.length > row+2){
                if(grid[row][col] != -1 &&grid[row][col + 1]!=-1 && grid[row+1][col+1]!=-1 && grid[row+2][col+1]!=-1){
                    return true;
                }
            }
        } else{
            if(0 <= col-1 && 0 <= row-2){
                if(grid[row][col] != -1 &&grid[row-1][col]!=-1 && grid[row-2][col]!=-1 && grid[row-2][col-1]!=-1){
                    return true;
                }
            }
        }
        return false;
    }
}
