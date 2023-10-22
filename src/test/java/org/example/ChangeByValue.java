package org.example;


import java.util.Arrays;

public class ChangeByValue {
    public static void main(String[] args) {
        int[] arr1 ={10,20,40,3};
        change(arr1);
        System.out.println(Arrays.toString(arr1));

        int a=5;
        int b=9;
        changePrimitives(a,b);
        System.out.println(a +" " + b);

        mul(a,b);
    }

    private static void mul(int a, int b) {
        System.out.println(a*b);
    }

    private static void changePrimitives(int a, int b) {
        int temp =a;
        a=b;
        b=temp;
        System.out.println("Inside swap"+ a +" "+ b);
    }

    private static void change(int[] arr) {
        arr[0]=6;
    }
}
