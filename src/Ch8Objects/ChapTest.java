package Ch8Objects;

import java.util.Arrays;

public class ChapTest {
    public static void main(String[] args) {
        String[] words = {"apple","pear", "this","cis"};
        String[] mixed = mixedWords(words);
        System.out.println(Arrays.toString(mixed));
    }
    public static String recombine(String word1, String word2){
        int w1l = word1.length()/2;
        String w1p = word1.substring(0,w1l);
        int w2l = word2.length()/2;
        String w2p = word2.substring(w2l);
        return w1p+w2p;
    }
    public static String[] mixedWords(String[] words){
        String[] mixed = new String[words.length];
        for(int i = 0; i<words.length-1; i+=2){
            mixed[i]=recombine(words[i],words[i+1]);
            mixed[i+1]=recombine(words[i+1],words[i]);
        }
        return mixed;
    }
}
