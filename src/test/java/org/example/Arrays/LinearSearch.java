package org.example.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,1,23,78,9,67};
        int target=5;
        System.out.println(linearSearch3(arr,target));
        System.out.println(linearSearch(arr,target));
        System.out.println(linearSearch2(arr,target));

    }

    public static int linearSearch(int[] arr, int target) {
        if (arr == null)
            return -1;

        for (int index = 0; index < arr.length - 1; index++) {
            if (arr[index] == target)
                return index;
        }
        return -1;
    }
    public static int linearSearch2(int[] arr, int target){
        if(arr==null)
            return -1;
        for(int index=0;index<arr.length-1;index++){
            if(arr[index]==target){
                return arr[index];
            }
        }
        return -1;
    }

    public static boolean linearSearch3(int[]arr, int target){
        for (int index = 0; index < arr.length-1; index++) {
            if(arr[index]==target){
                return true;
            }

        }
        return false;
    }


}
