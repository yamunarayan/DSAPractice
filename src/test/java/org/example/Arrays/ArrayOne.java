package org.example.Arrays;

import java.util.Arrays;

public class ArrayOne {
    public static void main(String[] args) {
        int[] arr= new int[10];
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
        String[] sarr = new String[20];
        System.out.println(sarr[2]);
        int[] arr1= {2, 4, 5};
        //arr is stored in stack and the value of arr is stored in heap, in heap each element ahs its own unique address
        //default value of reference object is null
        //default value of primitives its based on thr type.
    }
}
