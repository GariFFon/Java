package Search_Algorithms.Binary_Search_Algo.Binary_Search_Algo_Imp_Question;

import java.util.Scanner;

public class Ceiling_Of_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //remember always use the sorted array for binary search
        int[] arr = {1, 2, 3 ,4 ,5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int target = 1;
        int answer = Ceiling(arr,target);
        System.out.println(answer);
    }

    //return the index of the Smallest element in the array
    //which is greater or equal to the target element.
    static int Ceiling(int[] arr, int target){

        //BUt what if the target element is the greatest element in the array then there is no ceiling.

        if (target > arr.length -1 ){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;

        //To Find the middle element...
        while (start <= end){
//            int mid = (start + end) / 2;
//      Now what if this (start + end) exceeds the range of integer value in java

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }else{
                //midle element is the answer
                return mid;
            }
        }
        return start;
    }
}
