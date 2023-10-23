package org.example.binarySearch;

public class binSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        int target = 6;
        System.out.println(searchElement(arr, target));

    }

    public static int searchElement(int[] arr, int target) {

        int startIndex = 0;
        int endIndex = arr.length - 1;
        while(startIndex<=endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (target>arr[midIndex]){
                startIndex=midIndex+1;
            } else if (target<arr[midIndex]) {
                endIndex=midIndex-1;
            }else
                return midIndex;
        }
        return -1;
    }
}
