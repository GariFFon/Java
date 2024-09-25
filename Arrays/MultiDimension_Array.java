package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        Example

                1 2 3
                4 5 6
                7 8 9

         */
         int[][] arr = new int[3][3];
        System.out.println(arr.length); // give me number of rows -> 3
        // First one is no. of rows which is mandatory to put the size of this...
        // Second one is no of column which is not mandatory to put the size of this...

//        int[][] arr = {
//                {1,2,3}, // 0th index
//                {4,5,6}, // 1st index
//                {7,8,9} // 2nd index... arr2D[2] -> (7,8,9)
//        };
        //System.out.println(Arrays.toString(arr2D[1]));


        // input

        for (int row=0;row < arr.length;row++){
            // take number of rows
            for (int col =0; col< arr[row].length ;col++){
                arr[row][col]= in.nextInt();
            }
        }

        //output

        for (int row=0;row < arr.length;row++){
            // take number of rows
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
