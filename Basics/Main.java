package Basics;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println((13123));
        Scanner input = new Scanner(System.in);
        String Username;

        System.out.println("Enter your username");
        Username= input.nextLine();

        System.out.println("Your username is: "+ Username);
    }
}