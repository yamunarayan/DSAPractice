package org.example.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTwo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        String[] sarr= {"sdas","asd"};

        int[][] arr1= new int[3][3];
        // To read array value
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers in arrays");
        for(int row=0;row<arr1.length;row++){
            for(int col=0; col< arr1[row].length;col++){
                arr1[row][col]=in.nextInt();

            }
        }

        //To write array value
        for(int row=0; row<arr1.length; row++){
            System.out.println(Arrays.toString(arr1[row]));
           /* for(int col=0; col<arr1[row].length; col++){
           // why we are mentioning arr1[row] when col in not fixed length but it will have values in rows that the reason
                System.out.print(arr1[row][col] + " ");
            }*/
            //System.out.println();
        }

        //another way to write 2d array elements
        //its an array of array
        for(int[] a: arr1){
            System.out.println(Arrays.toString(a));
        }
    }
}
