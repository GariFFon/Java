package Important_Basics;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner in= new Scanner((System.in));

        //USING FOR LOOP

//        System.out.print("Enter a number: ");
//        int n=in.nextInt();
//        int a=0;
//        int b=1;
//        int sum=0;
//        for (int i=0;i<=(n-1);i++){
//            sum=a+b;
//            System.out.println(a);
//            a=b;
//            b=sum;


        //USING WHILE LOOP

        System.out.println("Enter a Number: ");
        int n=in.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        int count=0;

        while (count<=(n-1)){
            sum=a+b;
            System.out.println(a);
            a=b;
            b=sum;
            count++;
        }
    }
}
