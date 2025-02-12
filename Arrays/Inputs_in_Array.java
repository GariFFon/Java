package Arrays;

import java.util.Scanner;

public class Inputs_in_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr= new int[5];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        arr[4]=5;
//        System.out.println(arr[0]);

        // input using for loops
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter "+i+" Number: ");
            arr[i] = in.nextInt();
        }
        for (int j : arr) { // enhance way to write for loop in java
            System.out.print(j + " "); // here j represents elements of array.
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}

