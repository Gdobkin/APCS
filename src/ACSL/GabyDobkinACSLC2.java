package ACSL;

import java.util.Arrays;
import java.util.Scanner;
//please type and enter one line of input at a time
public class GabyDobkinACSLC2 {
    public static void main(String[] args) {
        for(int i = 1; i<6; i++) {
            Scanner linescan = new Scanner(System.in);
            String one = linescan.next();
            String two = linescan.next();
            String common1 = commonString(one,two);
            String common2 = commonString(two, one);
            String common3 = commonString(reverseOrder(one),reverseOrder(two));
            String common4 = commonString(reverseOrder(two),reverseOrder(one));
            common1=alphabatize(common1);
            common2=alphabatize(common2);
            common3=alphabatize(common3);
            common4=alphabatize(common4);
            String finalComp = removeRepeats(commonString(commonString(common1,common2),commonString(common3,common4)));
            if(finalComp.equals("")){
                System.out.println("NONE");
            } else{
                System.out.println(finalComp);
            }
        }

    }
    public static String commonString(String one, String two){
        String end = "";
        for(int k = 0; k<one.length(); k++) {
            for (int j = 0; j < two.length(); j++) {
                if (one.charAt(k) == two.charAt(j)) {
                    end += two.charAt(j);
                    two=two.substring(j+1);
                }
            }
        }
        return end;
    }
    public static String reverseOrder(String one){
        String flipped = "";
        for(int i = 0; i < one.length(); i++){
            flipped+=one.charAt(one.length()-1-i);
        }
        return flipped;
    }
    public static String alphabatize(String one){
        char tempArray[] = one.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static String removeRepeats(String one){
        for(int i = 0; i<one.length()-1; i++){
            if(one.charAt(i)==one.charAt(i+1)){
                one = one.substring(0,i)+one.substring(i+1);
            }
        }
        return one;
    }
}
