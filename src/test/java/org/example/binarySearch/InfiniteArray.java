package org.example.binarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,98,678,7879,890};
        int target = 8;
        System.out.println(findElement(arr,target));
    }

    public static int findElement(int[] arr, int target) {
        int start=0;
        int end=1;
        if(target>end){
            int newstart=end+1;
            end= end+(end-start+1)*2;
            start=newstart;
        }

        return searchElement(arr,target,start,end);
    }

    public static int searchElement(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else
                return mid;
        }
        return -1;
    }
}
