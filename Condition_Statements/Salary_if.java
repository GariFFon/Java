package Condition_Statements;

import java.util.Scanner;

public class Salary_if {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter The Salary Amount: ");
        int a= input.nextInt();
        if (a >= 10000){
            a+=2000;
            System.out.println("The Salary with increment is: "+a);
        } else{
            a+=1000;
            System.out.println(("The Salary with increment is: "+a));
        }
    }
}
