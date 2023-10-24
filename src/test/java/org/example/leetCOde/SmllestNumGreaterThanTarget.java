package org.example.leetCOde;

public class SmllestNumGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr= {'c','f','j'};
        char target = 'c';
        System.out.println(greaterTarget(arr, target));
    }

    public static char greaterTarget(char[] arr, char target) {
        int startIndex = 0;
        int endIndex=arr.length-1;
        while(startIndex<=endIndex){
            int midIndex=startIndex+(endIndex-startIndex)/2;
            if(target>arr[midIndex]){
                startIndex=midIndex+1;
            } else if (target<arr[midIndex]) {
                endIndex=midIndex-1;

            }
            return arr[midIndex];
        }
        return arr[startIndex];
    }
}
