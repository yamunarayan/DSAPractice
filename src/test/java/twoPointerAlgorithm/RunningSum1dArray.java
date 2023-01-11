package twoPointerAlgorithm;

import java.util.Arrays;

/*Approach: check the lenght of the array, if the array is empty return empty array
with size return the same element
create an empty array
iterate the input array and add the element from the first 2 index and save it in a new array; repeat the
same till the length of the input array

* */
public class RunningSum1dArray {

    int output[]={1,3,6,10};
    public static void main(String[] args){
        int input[]={1,2,3,4};
        runArraySt(input);
    }

    public static int[] runArraySt(int input[]){
        if(input==null||input.length==1)
            return input;
        for(int i=1;i<input.length;i++){
           input[i]+=input[i-1];
        }

System.out.println(Arrays.toString(input));
        return input;

    }
}
