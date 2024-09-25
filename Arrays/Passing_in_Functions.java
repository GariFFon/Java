package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Passing_in_Functions {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr= {3,4,5,6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0]=1;
    }
}
