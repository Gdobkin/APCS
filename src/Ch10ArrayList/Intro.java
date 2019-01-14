package Ch10ArrayList;

import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(); //PARENTHESIS CALLS CONSTRUCTOR
        for(int i = 1; i<11; i++){
            nums.add(i);
        }
        System.out.println(nums);
        for (int i = 1; i<11; i++){
            nums.set(i-1,nums.get(i-1)*i);
        }
        System.out.println(nums);

        ArrayList<String> students = new ArrayList<String>();
        students.add("Gaby");
        System.out.println(students);
        students.add("Cristina");
        System.out.println(students);
    }
}
