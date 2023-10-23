package org.example.binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
    //int[] arr = {3,4,5 ,6,7};
        int[] arr={9,8,6,5,4,2,-1,-4};
    int target =5;

        System.out.println(agnosticSearch(arr,target));

    }

    public static int agnosticSearch(int[] arr, int target) {
        int startIndex=0;
        int endIndex=arr.length-1;
        boolean isAsc = arr[startIndex]<arr[endIndex];
        while(startIndex<=endIndex){
            int midIndex= startIndex+(endIndex-startIndex)/2;
            if(target==arr[midIndex]) {
                return midIndex;
            }
            if(isAsc){
                if(target>arr[midIndex]){
                    startIndex=midIndex+1;
                }else
                    endIndex=midIndex-1;
            }else
            if(target<arr[midIndex]){
                startIndex=midIndex+1;
            }else
                endIndex=midIndex-1;
        }
        return -1;
    }
}
