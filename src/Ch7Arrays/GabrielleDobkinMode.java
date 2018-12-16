package Ch7Arrays;

import java.util.Arrays;

public class GabrielleDobkinMode {
    public static void main(String[] args) {
        int num = 12334566;
        System.out.println(liamPrice(num));
    }
    public static int liamPrice(int n){
        n=Math.abs(n);
        int[] tally = new int[10];
        while(n>0) {
            int test = n % 10;
            tally[test] = tally[test] + 1;
            n = n / 10;
        }
        int frequency = 0;
        int mostFrequent = 0;
        for (int i = 0; i<10; i++){
            if(tally[i]>frequency){
                frequency=tally[i];
                mostFrequent=i;
            }
        }
        return mostFrequent;
    }
    public static int gaby(int n){
        n=Math.abs(n);
        String num = n+"";
        int[] nums = new int[num.length()];
        for(int i = 0; i<nums.length;i++){
            nums[i]=n%10;
            n=n/10;
        }
        Arrays.sort(nums);
        int frequency = 0;
        int mostFrequent = 0;
        int tempNum=0;
        int tempFreq=0;
        for(int i = 0; i<nums.length; i++){
            if(tempNum==nums[i]){
                tempFreq++;
            } else{
                if(tempFreq>frequency){
                    frequency=tempFreq;
                    mostFrequent=tempNum;
                }
                tempNum=nums[i];
                tempFreq=1;
            }
        }
        if(tempFreq>frequency){
            mostFrequent=tempNum;
        }
        return mostFrequent;
    }
}
