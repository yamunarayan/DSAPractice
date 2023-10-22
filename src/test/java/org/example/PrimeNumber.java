package org.example;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println("Enter the number: ");
        boolean prime =isPrime(n);
        System.out.println(prime);
    }

    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c ==0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
