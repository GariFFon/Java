package Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class Swapping_values_in_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 3 ,4 ,5 ,6, 7, 8, 9, 10};
        //initializing...
        System.out.println(Arrays.toString(arr));

        swap(arr, 1 , 5);
        //used the funtion swap...
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int i, int i1) {
        int temp= arr[i];
        arr[i]= arr[i1];
        arr[i1]=temp;
    }
}
