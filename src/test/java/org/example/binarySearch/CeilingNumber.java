package org.example.binarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {4,5,6,789,456};
        int target =7;
        System.out.println(ceiling(arr,target));
    }

    public static int ceiling(int[] arr, int target) {
        if(target>arr[arr.length-1]){
            return -1;
        }
        int startIndex=0;
        int endIndex=arr.length-1;
        while(startIndex<=endIndex){
            int midIndex= startIndex+(endIndex-startIndex)/2;
            if(arr[midIndex]==target)
                return midIndex;
            else if(arr[midIndex]<target){
                startIndex=midIndex+1;
            }else
                endIndex=midIndex-1;

        }
        return startIndex;
    }
}
