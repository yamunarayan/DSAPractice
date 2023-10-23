package org.example.Arrays;

public class LinearSearchWithString {
    public static void main(String[] args) {
        String name="Yamuna";
        char target ='m';
        System.out.println(linearSearchString(name,target));
        System.out.println(linearSearchString2(name,target));


    }

    public static boolean linearSearchString(String name, char target) {
        if(name==null)
            return false;
        for (int index = 0; index < name.length()-1; index++) {
            if(name.charAt(index)==target){
                return true;
            }
        }
        return false;
    }
    public static boolean linearSearchString2(String name, char target){
        if(name==null)
            return false;
        for (char c:name.toCharArray()){
            if(c==target){
                return true;
            }
        }
        return false;
    }
}
