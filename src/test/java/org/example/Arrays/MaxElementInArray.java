package org.example.Arrays;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,4, 5,6};
        System.out.println(maxElement(arr));
        maxWithRange(arr,1,2);
        System.out.println(maxWithRange(arr,1,2));
    }

    public static int maxWithRange(int[] arr, int start, int end) {
        int max=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }

    public static int maxElement(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
