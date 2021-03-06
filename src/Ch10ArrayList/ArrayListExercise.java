package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("G:\\My Drive\\APCS\\data"));
        ArrayList<String> words = new ArrayList<>();
        while(scan.hasNext()){
            words.add(scan.next());
        }
        ArrayList<Integer> one =new  ArrayList<Integer>();
        one.add(1);
        one.add(4);
        one.add(8);
        one.add(9);
        one.add(11);
        one.add(15);
        one.add(17);
        one.add(28);
        one.add(59);

        ArrayList<Integer> two =new  ArrayList<Integer>();
        two.add(4);
        two.add(7);
        two.add(11);
        two.add(17);
        two.add(19);
        two.add(20);
        two.add(23);
        two.add(28);
        two.add(37);
        two.add(59);
        two.add(81);
        System.out.println(intersect(one,two));
    }
    private static void printReg(ArrayList words){
        System.out.println(words);
    }
    private static void reversed(ArrayList words){
        for(int i = 0; i<words.size(); i++){
            System.out.println(words.get(words.size()-1-i));
        }
    }
    private static void capAndPlural(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(words.get(i).length() - 1) != 's') {
                System.out.println(words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1) + "s");
            } else {
                System.out.println(words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1));
            }
        }
    }
     private static void capPlurals(ArrayList<String> words){
        for(int i = 0; i<words.size(); i++){
            if(words.get(i).charAt(words.get(i).length()-1)=='s') {
                System.out.println(words.get(i).substring(0,1).toUpperCase()+words.get(i).substring(1));
            } else{
                System.out.println(words.get(i));
            }
        }
    }
    private static void removePlural(ArrayList<String> words){
        for(int i = 0; i<words.size(); i++){
            if(words.get(i).charAt(words.get(i).length()-1)!='s') {
                System.out.println(words.get(i));
            }
        }
    }

    public static void addStars(ArrayList<String> words){
        int size = words.size();
        for(int i = 1; i < size*2-1; i+=2){
            words.add(i,"*");
        }
    }
    public static void removeStars(ArrayList<String> words){
        int size = words.size();
        for(int i = 1; i < size/2+1; i++){
            words.remove(i);
        }
    }
    public static ArrayList<Integer> intersect(ArrayList<Integer> one, ArrayList<Integer> two){
        ArrayList<Integer> end = new ArrayList<>();
        for(int k = 0; k<one.size(); k++) {
            for (int j = 0; j < two.size(); j++) {
                if (one.get(k) == two.get(j)) {
                    end.add(two.get(j));
                    two.remove(two.get(j));
                }
            }
        }
        return end;
    }
    //can use .contains as well
}

