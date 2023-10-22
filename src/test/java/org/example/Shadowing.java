package org.example;

public class Shadowing {
    static int x=9;

    public static void main(String[] args) {
        System.out.println(x);
        int x=0;
        System.out.println(x);
        testShdow();

    }

    private static void testShdow() {
        System.out.println(x);
    }
}
