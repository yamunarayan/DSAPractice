package org.example.leetCOde;

public class NumWithEvenND {
    public static void main(String[] args) {
        int[] nums = {-12, 345, 2, 6, -7896, 95645};
        System.out.println(findNumbers(nums));
        //System.out.println(digits(7896));

    }

    public static int findNumbers(int[] nums) {
        int count =0;
        for(int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    public static  boolean even(int num){
        int digits=digits(num);
        return digits%2==0;
    }

    public static int digits(int num){
        if(num<0){
            num= num * -1;
        }

        int count =0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

}