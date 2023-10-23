package org.example.Arrays;

import java.util.Arrays;


public class SwapandReverseElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,4, 5,6};
        //swaparray(arr,1,2);
        //System.out.println(Arrays.toString(arr));
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] reverseArr(int[] arr) {
        if(arr==null)
        return arr;
        int start=0;
        int end = arr.length-1;
        while(end>start) {
            swaparray(arr, start, end);
            start++;
            end --;
        }
return arr;
    }

    public static void swaparray(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
