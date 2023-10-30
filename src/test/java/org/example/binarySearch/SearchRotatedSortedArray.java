package org.example.binarySearch;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,3};
        int target =5;
        System.out.println(findPivot(arr));
        System.out.println(searchInRotationalArray(arr, target));
    }

    private static int searchInRotationalArray(int[] arr, int target) {
        int pivot=findPivot(arr);
        if(pivot ==-1){
            return binarySearchRA(arr,target, 0, arr.length-1);
        }
        if(target==arr[pivot]){
            return pivot;
        }
        if(target>arr[0]){
            return binarySearchRA(arr,target,0,pivot-1);
        }
        else
            return binarySearchRA(arr, target,pivot+1, arr.length-1);
    }

    private static int binarySearchRA(int[] arr, int target, int start, int end) {
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else
                return mid;
        }
        return -1;
    }

    private static int findPivot(int[] arr) {
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end =mid-1;
            }
            else
                start=mid+1;
        }
      return -1;
    }


}
