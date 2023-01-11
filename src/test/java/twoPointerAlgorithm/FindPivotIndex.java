package twoPointerAlgorithm;

public class FindPivotIndex {

    public static void main(String[] args){
        int nums[] = {1,7,3,6,5,6};
        pivotSF(nums);
    }
    public static int pivotSF(int nums[]){
        int total_sum=0;
        for(int i:nums) total_sum+=i;

        int actual_sum=0;
        for(int i=0;i<nums.length;i++){
            if((total_sum-nums[i]-actual_sum)==actual_sum) return i;
            actual_sum+=nums[i];
        }
        return -1;
    }
}
