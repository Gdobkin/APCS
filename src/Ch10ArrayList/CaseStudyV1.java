package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;//the wheels on the bus go round and round, round and round, round and round
import java.util.Collections;
import java.util.Scanner;

//the wheels on the bus go round and round, round and round, round and round
public class CaseStudyV1 {//the wheels on the bus go round and round, round and round, round and round

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("text1.txt"));
        Scanner input2 = new Scanner(new File("text2.txt"));
        ArrayList<String> words1 = wordListNP(input1);
        ArrayList<String> words2 = wordListNP(input2);
        ArrayList<String> overlap = overlap(words1,words2);
        System.out.println(words1);
        System.out.println(words2);
        System.out.println(overlap);
        System.out.println("Percent Overlap 1:" + percentOverlap(words1,overlap));
        System.out.println("Percent Overlap 2:" + percentOverlap(words2,overlap));

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

    public static ArrayList<String> wordListNP(Scanner input){
        //temp array
        ArrayList<String> words = new ArrayList<>();
        //populate and get rid of punctuation
        while(input.hasNext()){
            String Text = input.next().toLowerCase();
            String[] Res = Text.split("[\\p{Punct}\\s]+");
            for (String s:Res){
                words.add(s);
            }
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