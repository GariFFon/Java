package Search_Algorithms.LInear_Search_Algo;

import java.util.Scanner;

public class Linear_search_algo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int ans= linear_search(arr,target);
        int ans2= linear_search2(arr, target);
        System.out.println(ans);
        System.out.println(ans2);

    }

    //search the item in the array: return the index of the given value.
    //if the item or target is not found in the given array the return -1.
    static int linear_search(int[] arr, int target){
     if (arr.length == 0){
         return -1; // if the whole Array is empty
     }
        for (int index = 0; index < arr.length; index++) {
            //check for every element in index if it = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //This line will execute if none of the written statement above is true...
        //hence the target is not found...
        return -1;
    }

    //Now what is the user says return me the target from the given index value

    static int linear_search2(int[] arr, int target){
        if (arr.length == 0) return -1; // if the whole Array is empty
        for (int element : arr) { //enhance way of writing for loop..
            //check for every element in index if it = target
            if (element == target) {
                return element;
            }
        }
        //This line will execute if none of the written statement above is true...
        //hence the target is not found...
        return -1;
    }

    //Now what if user says return me in the form of true or false...

    static boolean linear_search3(int[] arr, int target){
        if (arr.length == 0) return false; // if the whole Array is empty
        for (int element : arr) { //enhance way of writing for loop..
            //check for every element in index if it = target
            if (element == target) {
                return true;
            }
        }
        //This line will execute if none of the written statement above is true...
        //hence the target is not found...
        return false;
    }







}
