package Search_Algorithms.LInear_Search_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Search_And_Max_In_2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = {
                {1,2},
                {3,4},
                {5,6},
                {7,8},
                {9,10}
        };
        int target = 9;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] Search(int[][] arr, int target){
//        if (arr.length == 0){
//            return -1;
//        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row ,col};
                }
            }
        }
        return new int[]{-1 ,-1};
    }


    static int max(int[][] arr){
//        if (arr.length == 0){
//            return -1;
//        }
        int max= Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
