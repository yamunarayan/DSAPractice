package org.example.collectionsJ;

import java.util.ArrayList;
import java.util.Scanner;

public class MulAraayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements : ");
        ArrayList<ArrayList>list =new ArrayList<>();
        //Initialization
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
// Reading values to the arraylist
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

        //Writing values from the array list
        for(int i=0;i<3;i++){
            System.out.println(list.get(i));

        }

    }
}
