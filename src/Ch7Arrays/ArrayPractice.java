package Ch7Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] random = new int[(int) (Math.random() * 10 + 1)];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(random));
    }
}
