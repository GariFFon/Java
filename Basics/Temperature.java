package Basics;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter temperature in C: ");
        float tempc=input.nextFloat();
        float tempf= (tempc * 9/5) +32;
        System.out.println("Temperature in F: "+tempf);
    }
}
