package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start < end){ // this is two pointer method
            swap(arr, start , end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int i1) {
        int temp= arr[i];
        arr[i]= arr[i1];
        arr[i1]=temp;
    }
}
