package org.example.binarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,99};
        int target=99;
        System.out.println(floorN(arr, target));
    }

    public static int floorN(int[] arr, int target) {
        int startIndex=0;
        int endIndex=arr.length-1;
        while(startIndex<=endIndex){
            int midIndex=startIndex+(endIndex-startIndex)/2;
            if(target==arr[midIndex])
                return midIndex;
            if(target>arr[midIndex]){
                startIndex=midIndex+1;

            }else
                endIndex=midIndex-1;

        }

        return endIndex;
    }
}
