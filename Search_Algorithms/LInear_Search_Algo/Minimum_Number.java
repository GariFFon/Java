package Search_Algorithms.LInear_Search_Algo;

import java.util.Scanner;

public class Minimum_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q) Find Minimum Element in array...

        int[] arr= {22,21,20,19,18,17,16,15,14,1};
        System.out.println(Search(arr));
    }

    static int Search(int[] arr){
        if (arr.length == 0){
           return -1;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                 min = arr[i];
            }
        }
    return min;
    }
}
