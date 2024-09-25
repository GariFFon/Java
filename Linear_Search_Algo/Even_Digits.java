package Linear_Search_Algo;
//Q)  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import java.util.Scanner;

public class Even_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] num= {12,345,2,6,7896};
        System.out.println(FindNumbers(num)); //ANSWER
//        System.out.println(digits(54321));
        //Will count the number of digtis in the given number... In this case '5'
    }
    static int FindNumbers(int[] nums){
        int count = 0;
        for( int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //funtion to check that the number contains even number of digits or not..
     static boolean even(int num) {
        int NumberOfDigits = digits(num);
        if (NumberOfDigits % 2 ==0){
            return true;
        }
        return false;

    }
    static int digits(int num){
        int count = 0;

        while (num>0){
            count++;
            num = num /10;
        }
        return count;
    }
}
