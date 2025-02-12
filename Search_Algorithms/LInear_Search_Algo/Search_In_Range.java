package Search_Algorithms.LInear_Search_Algo;

import java.util.Scanner;

public class Search_In_Range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q)Search for 3 in the raneg of index [1,4]

        int[] arr= {1,2,4,3,5,6,7,8,9};
        int start = arr[1];
        int end = arr[4];
        int target = 3;
        System.out.println(Search(arr, start, end, target));
    }

    static int Search(int[] arr, int start, int end, int target){
       if (arr.length == 0){
           return -1;
       }
        for (int i = start; i < end; i++) {

            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}
