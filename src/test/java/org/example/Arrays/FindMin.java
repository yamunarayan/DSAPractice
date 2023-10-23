package org.example.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr= {2,8,9,3,5,1};
        System.out.println(minElement(arr));
    }

    public static int minElement(int[] arr) {
        if(arr==null)
            return -1;
        int minValue=arr[0];
        for (int index = 1; index <arr.length; index++) {
            if(arr[index]<minValue){
                minValue=arr[index];
            }
        }
        return minValue;
    }
}
