package twoPointerAlgorithm;

import junit.framework.Assert;

import java.util.Arrays;

/* Problem statement:Given an array, cyclically rotate the array clockwise by K.
Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
Steps to implement: 1.Create one temporary varaible
2.store the last element in the temporary variable
3. move the rest of the element to next position

 * */
public class CyclicalRotateOfArray {
    public static void main(String[] args) {
        int input[] = {1, 2, 3, 4, 5,6,7};
        int output[] ={5,6,7, 1, 2, 3, 4};
        Assert.assertEquals(Arrays.toString(output),Arrays.toString(rotateArrayT(input,3)));


    }

        public static int[] rotateArrayBruteForce(int[] input, int k){
        if(input.length==0|input.length==1)
            return input;
        int last;
        for(int j=0;j<k;j++){
            last=input[input.length-1];
            for(int i=input.length-1;i>0;i--){
                input[i]=input[i-1];
            }
            input[0]=last;
        }
        return input;
        }
        //Time complexity: O(n*k) space complexity: O(1)

    public static int[] rotateArrayUsingExtraMemory(int[] input, int k){
        if(input.length==0|input.length==1)
            return input;
        int[] copyArray = new int[input.length];
        for(int i=0;i<input.length;i++){
            copyArray[(i+k)%input.length]=input[i];
        }
        for(int i=0;i<copyArray.length;i++){
            input[i]=copyArray[i];
        }
        return input;
    }
    //Time complexity: O(n) space complexity: O(n)

    public static int[] rotateArrayT(int[] input, int k) {
        if (input.length == 0 | input.length == 1)
            return input;
        k %= input.length;
        reverseArray(input,0,input.length-1);
        reverseArray(input,0,k-1);
        reverseArray(input,k,input.length-1);


        return input;
    }

    private static void reverseArray(int[] input, int startIndex, int endIndex){
        while(startIndex < endIndex){
            int temp=input[startIndex];
            input[startIndex]=input[endIndex];
            input[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
    }
}
