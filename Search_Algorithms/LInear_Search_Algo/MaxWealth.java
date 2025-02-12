package Search_Algorithms.LInear_Search_Algo;

import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
    public int maximumWealth(int[][] accounts) {
        // person -> row
        // account -> column
        int ans= Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            //when you start a new col, take a new sum of that row...
            int sum =0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
