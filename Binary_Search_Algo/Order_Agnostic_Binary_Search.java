package Binary_Search_Algo;

import java.util.Scanner;

public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {
        //Time Complexity is 0(logN)
        Scanner in = new Scanner(System.in);
        //array in ascending order
//      int[] arr = {1, 2, 3 ,4 ,5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //array in descending order
        int[] arr = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 1;
        int answer = Binray_Search(arr, target);
        System.out.println(answer);
    }
    //return the index
    //return -1 if it does not exist.
    static int Binray_Search(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        //Find whether the array is sorted in ascending or descending order
        boolean isAsc;
        if (arr[start] < arr[end]){
            isAsc = true;
        }else {
            isAsc = false;
        }

        //To Find the middle element...
        while (start <= end){
//            int mid = (start + end) / 2;
//      Now what if this (start + end) exceeds the range of integer value in java

            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

