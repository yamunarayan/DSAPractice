package org.example;

import java.util.Arrays;

public class VarArgs {
    //varagrs argument is a collection of data in mentioned type; it stores data in arrays.
    //vararg length is always at the end.
    public static void main(String[] args) {
        testVarArgs(1,2,3,4);
        testvArgs(2,3,"ssadf","sdfasdf","sdfasd");
       // textvarargswithnoP();
        //when we override Varargs it cannot be empty
    }

    public static void textvarargswithnoP(int ...p) {
        System.out.println(Arrays.toString(p));
    }

    public static void textvarargswithnoP(String ...p) {
        System.out.println(Arrays.toString(p));
    }


    private static void testvArgs(int a, int b, String ... y) {
        System.out.println(a +" " + " " +b + " " +Arrays.toString(y));
    }

    private static void testVarArgs(int ... x) {
        System.out.println(Arrays.toString(x));
    }


}
