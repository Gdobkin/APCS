package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;//the wheels on the bus go round and round, round and round, round and round
import java.util.Scanner;

//the wheels on the bus go round and round, round and round, round and round
public class CaseStudyV1 {//the wheels on the bus go round and round, round and round, round and round

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("text1.txt"));
        Scanner input2 = new Scanner(new File("text1.txt"));
        ArrayList<String> words1 = getWords(input1);
        ArrayList<String> words2 = getWords(input2);


    }
    public static ArrayList<String> getWords(Scanner input){
        ArrayList<String> words1 = new ArrayList<>();
        while(input.hasNext()){
            words1.add(input.next());
        }
        return words1;
    }


}
