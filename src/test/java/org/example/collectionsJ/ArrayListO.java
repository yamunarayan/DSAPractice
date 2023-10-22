package org.example.collectionsJ;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListO {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(4);
        //we can write without generics also but its not a good practice
        System.out.println(list);

        list.add(2);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(0);
        //capacity is 4 but it will not restirct additional values, it will grow the size based on the added values
       // list.add(6.5); we have mentioned it as of type interger so it will not allow other types
        System.out.println(list); // will print the list values
        list.set(0,99); // it will replace the old value with the new value
        System.out.println(list);
        list.remove(4);
        System.out.println(list);


        //Another way to add element to the list
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to add in ArrayList : ");
        ArrayList<Integer>list1 = new ArrayList<>(3);
        System.out.println(list1.size());
        for(int i=0;i<3;i++){
            list1.add(in.nextInt());
        }
        //Another way to read data from the list
        for(int i=0;i<3;i++){
            System.out.println(list1.get(i));

        }


    }
}
