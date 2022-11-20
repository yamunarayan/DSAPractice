package twoPointerAlgorithm;

import junit.framework.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumInArray {
    /*Problem statement:Given an array of integers nums and an integer target, return indices of the
     two numbers such that they add up to target.
     Questions to be asked: What if array has no element;
     what if array has negative elements
     array has one element
     Input: nums = [2,7,11,15], target = 9
     Output: [0,1]
    * */
    public static void main(String[] args){
    int[] nums={2,7,11,15};
    int target =9;
    int[] output={0,1};
        Assert.assertEquals(Arrays.toString(output),Arrays.toString(twoSumHashMap(nums,9)));

        Assert.assertEquals(Arrays.toString(output),Arrays.toString(twoSumBruteForce(nums,9)));

    }

    public static int[] twoSumBruteForce(int[] nums, int target){
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]+nums[j]==target){
                   return new int[]{i,j};
               }

           }
       }

        return nums;
    }
    public static int[] twoSumHashMap(int[] nums, int target){
        int[] result= new int[2];
        Map<Integer, Integer> index = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(index.containsKey(target-nums[i])){
                result[0]=index.get(target-nums[i]);
                result[1]=i;
            }
            else{
                index.put(nums[i],i);
            }
        }
        return result;

    }
}
