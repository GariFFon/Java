package Basics;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First No.");
        int num1=input.nextInt();
        System.out.println("Enter second No.");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("Sum is: "+sum);
    }
}
