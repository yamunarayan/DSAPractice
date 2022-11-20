package twoPointerAlgorithm;

import java.util.Arrays;

//Problem statement: Given an integer array and a target value k, remove all the occurrences of the target
//element and return the array
//Eg input: int[]arr={1,2,3,4,5,5,6}, k=5
//Output: {1,2,3,4,6}
//Possibilities :array with no repeated element, empty array, array with same element.
//Constraints: Solve using additional space initially and optimise it to O(1) space
public class RemoveAllOccurancesOfTargetElement {
public static void main(String[] args){
    int[]input={1,2,3,4,5,5,6};
    System.out.print(Arrays.toString(bruteForceMethod(input,5)));

}

public static int[] bruteForceMethod(int[] input, int target){
   int j=0, i=0;
   while(i<input.length){
       if(input[i]==target){
           input[j]=input[i];
           j+=1;
       }
       i+=1;
   }
return input;
   }


}
