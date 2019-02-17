package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class CaseStudyV2 {//stop words eliminated

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("This program compares two text files\nand reports the number of words in\ncommon and the percent overlap.\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("file #1 name? ");
        Scanner input1 = new Scanner(new File(userInput.next()));
        System.out.print("file #2 name? ");
        Scanner input2 = new Scanner(new File(userInput.next()));
        ArrayList<String> words1 = wordList(input1);
        ArrayList<String> words2 = wordList(input2);
        Scanner sw = new Scanner(new File("stopWords.txt"));
        ArrayList<String> stopWords = wordList(sw);
        words1 = reverseOverlap(words1, stopWords);
        words2 = reverseOverlap(words2, stopWords);
        ArrayList<String> overlap = overlap(words1,words2);
        System.out.println("\nfile #1 words = " + words1.size());
        System.out.println("file #2 words = " + words2.size());
        System.out.println("common words = " + overlap.size());
        System.out.println("% of file 1 in overlap = " + percentOverlap(words1,overlap));
        System.out.println("% of file 2 in overlap = " + percentOverlap(words2,overlap));
  }

    public static ArrayList<String> wordList(Scanner input){
        input.useDelimiter("[^a-zA-Z']+");
        //temp array
        ArrayList<String> words = new ArrayList<>();
        //populate
        while(input.hasNext()){
            words.add(input.next().toLowerCase());
        }
        //sort
        Collections.sort(words);
        //get rid of duplicates by creating a new array where we will add unique words
        ArrayList<String> unique = new ArrayList<>();
        unique.add(words.get(0));
        for(int i = 1; i<words.size(); i++){
            if(!words.get(i).equals(words.get(i-1))) {
                unique.add(words.get(i));
            }
        }
        //return unique into other arrayList
        return unique;
    }

    public static ArrayList<String> overlap(ArrayList<String> a, ArrayList<String> b){
        int i1 = 0;
        int i2 = 0;
        ArrayList<String> common = new ArrayList<>();
        while(i1<a.size()&&i2<b.size()){
            int compare = a.get(i1).compareTo(b.get(i2));
            if(a.get(i1).equals(b.get(i2))){
                common.add(a.get(i1));
                i1++;
                i2++;
            } else if(compare<1){
                i1++;
            } else{
                i2++;
            }
        }
        return common;
    }
    public static ArrayList<String> reverseOverlap(ArrayList<String> a, ArrayList<String> b){
        int i1 = 0;
        int i2 = 0;
        ArrayList<String> uncommon = new ArrayList<>();
        while(i1<a.size()&&i2<b.size()){
            int compare = a.get(i1).compareTo(b.get(i2));
            if(a.get(i1).equals(b.get(i2))){
                i1++;
                i2++;
            } else if(compare<1){
                uncommon.add(a.get(i1));
                i1++;
            } else{
                i2++;
            }
        }
        return uncommon;
    }

    public static double percentOverlap(ArrayList<String> words, ArrayList<String> overlap){
        double cumulative = 0;
        for(int i = 0; i<overlap.size(); i++){
            if(words.contains(overlap.get(i))){
                cumulative++;
            }
        }
        return cumulative/words.size()*100;
    }
}