package Basics;

import java.util.Scanner;

public class Counting_Occurrences {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=in.nextInt();
        System.out.println("Enter the number you want check occurrence for: ");
        int check= in.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            if (rem == check){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
