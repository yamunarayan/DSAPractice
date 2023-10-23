package org.example.Arrays;

public class SearchWithinRange {
    public static void main(String[] args) {
        int[] arr ={3,5,6,8,1,23,43};
        int target=43;
        System.out.println(searchRange(arr,target,3,6));
    }

    public static int searchRange(int[] arr, int target, int start, int end) {
        if(arr.length==0)
            return -1;
        for(int index=start; index<=end; index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
