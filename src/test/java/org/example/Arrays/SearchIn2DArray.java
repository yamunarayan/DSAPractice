package org.example.Arrays;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {
                {3,4,5},
                {6,4,2,7},
                {9,-1}
        };
        int target=6;
        System.out.println(Arrays.toString(search2D(arr, target)));
        System.out.println(min2D(arr));
        System.out.println(max2D(arr));

    }

    public static int[] search2D(int[][] arr, int target) {
        if(arr.length==0)
            return new int[]{-1,-1};
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int min2D(int[][] arr){
        if(arr.length==0)
            return -1;
        int min=Integer.MAX_VALUE;
        for(int[] row:arr){
            for(int col:row){
                if(col<min){
                    min=col;
                }
            }

        }
        return min;
    }

    public static int max2D(int[][] arr){
        if(arr.length==0)
            return -1;
        int maxValue=Integer.MIN_VALUE;
        for(int[] row:arr){
            for (int col:row){
                if(col>maxValue){
                    maxValue=col;
                }
            }
        }
        return maxValue;
    }
}
