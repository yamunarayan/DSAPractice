package twoPointerAlgorithm;

public class Pallindrome {
    public static void main(String[] args){
        isPalindrome(1210);
    }
    public static boolean isPalindrome(int x){
        if(x<0||(x%10==0 && x!=0))
            return false;
        int r=0;
        while(x>r){
          r = r*10 + x%10;
          x=x/10;

        }

        return r==x || r/10==x;
    }
}
