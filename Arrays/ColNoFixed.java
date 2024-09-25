package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ColNoFixed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] arr ={
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        //output

        for (int row=0; row < arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
