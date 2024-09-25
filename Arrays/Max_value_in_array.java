package Arrays;

import java.util.Scanner;

public class Max_value_in_array {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9};
//      System.out.println(max(arr));
        System.out.println(maxRange(arr,2,7));

    }

    //Imagine that array is not empty

//    static int max(int[] arr){
//    int maxvalue=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (maxvalue < arr[i]){
//                maxvalue =arr[i];
//            }
//        }
//        return maxvalue;
//    }
//}



    //Work on the edge cases on yourself like....
    //The given array is null...
//          if(arr == null){
//              return -1;
//              }


//          if (end > start){
//              return -1;
//              }


    static int maxRange(int[] arr, int start, int end){
    int maxvalue=arr[start];
        for (int i =start; i <= end; i++) {
            if (maxvalue < arr[i]){
                maxvalue =arr[i];
            }
        }
        return maxvalue;
    }
}
