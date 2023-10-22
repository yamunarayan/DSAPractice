package org.example;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();
        System.out.println(isArmstrong(n));

    }

    public static boolean isArmstrong(int n) {
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum = sum + rem*rem*rem;
        }
        return sum==original;
    }
}
