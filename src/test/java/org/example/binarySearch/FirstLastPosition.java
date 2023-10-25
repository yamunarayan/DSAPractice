package org.example.binarySearch;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums= {5,7,7,8,8,10};
        int target= 8;
        System.out.println(Arrays.toString(searchBruthe(nums, target)));
        System.out.println(Arrays.toString(UsingBinarySearch(nums,target)));
    }

    public static int[] UsingBinarySearch(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=startandEnd(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=startandEnd(nums,target,false);
        }
        return ans;
    }

    public static int startandEnd(int[] nums, int target, boolean findStartIndex){
        int ans=-1;
        int startIndex=0;
        int endIndex=nums.length-1;
        while(startIndex<=endIndex){
            int midIndex= startIndex+(endIndex-startIndex)/2;
            if(target>nums[midIndex]){
                startIndex=midIndex+1;
            } else if (target<nums[midIndex]) {
                endIndex=midIndex-1;
            }else {
                ans = midIndex;
                if (findStartIndex == true) {
                    endIndex = midIndex - 1;
                } else
                    startIndex = midIndex + 1;
            }
        }

        return ans;
    }


    public static int[] searchBruthe(int[] nums, int target) {
        int[] ans={-1,-1};
        for(int i=0;i<nums.length-1;i++) {
            if (nums[i] == target) {
                ans[1]=i;
                for (int j = nums.length - 1; j >= 0; j--) {
                    if(nums[j]==target){
                       ans[0]=j;
                    }
                }
            }
        }
        return ans;

    }
}
