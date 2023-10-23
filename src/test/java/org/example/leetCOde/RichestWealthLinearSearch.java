package org.example.leetCOde;

public class RichestWealthLinearSearch {
    public static void main(String[] args) {
        int[][] wealth = {{1,2,3},
                {3,2,1,89}};
        System.out.println(richestWealth(wealth));
    }

    public static int richestWealth(int[][] wealth) {
        int totalWealth=Integer.MIN_VALUE;
        for(int row=0;row<wealth.length;row++){
            int sum=0;
            for(int col=0;col<wealth[row].length;col++){
                    sum+=wealth[row][col];
            }
            if(sum>totalWealth){
                totalWealth=sum;
            }
        }
        return totalWealth;
    }

}
