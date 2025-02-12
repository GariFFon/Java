package Basics;

import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter the number to check whether it is prime or not...");
//        int num = in.nextInt();
//
//        for (int i=1;i<=num;i++) {
//            if (num % i == 0) {
//                System.out.println("The Number is prime");
//
//            } else {
//                System.out.println("The number is not prime");
//            }
//        }

        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(isPrime(n));




    }
        static boolean isPrime(int n){

        if (n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if (c%n == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
        }

}
