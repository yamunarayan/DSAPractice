package org.example;

public class BlockSpace {
    public static void main(String[] args) {
        int a=8;
        System.out.println(a);


        {
            a=0;
            System.out.println(a);
            int c=34;
            System.out.println("Print c value in inside block " +c);

        }
        notchangeing(a);
        int c=36;
        System.out.println("Print c value in outside block " +c);

        System.out.println(a);

    }

    public  static void notchangeing(int a) {

        a=78;
        System.out.println(a);
    }

}
