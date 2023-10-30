package org.example.binarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
    int[] mountainArr={1,2,3,4,5,3,1};
    int target=3;
        System.out.println(search(mountainArr, target));
    }
    public static int search(int[] mountainArr, int target){
        int peakElement = findInMountainArray(mountainArr);
        int firstTry=agnosticSearch(mountainArr,target,0,peakElement);
        if(firstTry!=-1){
            return firstTry;
        }
        return agnosticSearch(mountainArr,target,peakElement+1,mountainArr.length-1);
    }
    public static int findInMountainArray(int[] mountainArr) {
        int start=0;
        int end=mountainArr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(mountainArr[mid]>mountainArr[mid+1]){
                end=mid;
            }else if(mountainArr[mid]<mountainArr[mid+1]){
                start=mid+1;
            }

        }
        return start;
    }

    public static int agnosticSearch(int[] mountainArr, int target, int start, int end){

        boolean isAsc=mountainArr[start]<mountainArr[end];
        while(start<=end){
            int midIndex= start+(end-start)/2;
            if(target==mountainArr[midIndex]) {
                return midIndex;
            } if(isAsc){
                if(target>mountainArr[midIndex]){
                    start=midIndex+1;
                }else
                    end=midIndex-1;
            }else
            if(target<mountainArr[midIndex]){
                start=midIndex+1;
            }else
                end=midIndex-1;
        }

        return -1;
    }

}
