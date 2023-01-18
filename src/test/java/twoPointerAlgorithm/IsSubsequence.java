package twoPointerAlgorithm;

import org.testng.annotations.Test;

public class IsSubsequence {
    public static void main(String[] args){
        String s="abc";
        String t= "ahbgdc";
        subseq(s,t);
    }
    public static boolean subseq(String s, String t){
        if (s.length()==0) return true;
        int s_pointer=0;
        int t_pointer=0;
        while(t_pointer<t.length()){
            if(t.charAt(t_pointer)==s.charAt(s_pointer)){
                s_pointer++;
            }
            t_pointer++;
            if(s_pointer==s.length()) return true;
        }

        return false;

    }

    
}
