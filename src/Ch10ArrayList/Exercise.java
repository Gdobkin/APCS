package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("G:\\My Drive\\APCS\\data"));
        ArrayList<String> words = new ArrayList<>();
        while(scan.hasNext()){
            words.add(scan.next());
        }

        printReg(words);
        System.out.println();
        reversed(words);
        System.out.println();
        capPlurals(words);
        System.out.println();
        removePlural(words);
    }
    public static void printReg(ArrayList words){
        System.out.println(words);
    }
    public static void reversed(ArrayList words){
        for(int i = 0; i<words.size(); i++){
            System.out.println(words.get(words.size()-1-i));
        }
    }
    public static void capAndPlural(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(words.get(i).length() - 1) != 's') {
                System.out.println(words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1) + "s");
            } else {
                System.out.println(words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1));
            }
        }
    }
    public static void capPlurals(ArrayList<String> words){
        for(int i = 0; i<words.size(); i++){
            if(words.get(i).charAt(words.get(i).length()-1)=='s') {
                System.out.println(words.get(i).substring(0,1).toUpperCase()+words.get(i).substring(1));
            } else{
                System.out.println(words.get(i));
            }
        }
    }
    public static void removePlural(ArrayList<String> words){
        for(int i = 0; i<words.size(); i++){
            if(words.get(i).charAt(words.get(i).length()-1)=='s') {
                continue;
            } else{
                System.out.println(words.get(i));
            }
        }
    }
}

