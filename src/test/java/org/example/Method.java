package org.example;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        sum();

    }

    public static void sum(){
        int n1,n2,sum;
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1=in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        n2=in2.nextInt();
        sum = n1+n2;
        System.out.println("The sum = " + sum);
    }

}
