package Funtions_Methods;

import java.util.Scanner;

public class Funtions {

//    static void sum(){
//        Scanner in=new Scanner(System.in);
//        System.out.print(("Enter No. 1:"));
//        int num1= in.nextInt();
//        System.out.print("Enter no. 2:");
//        int num2= in.nextInt();
//        System.out.println("The sum of both the no. is..." + (num1 + num2));

    //Returing Int type... same with string....

//      static int sum(){
//          Scanner in=new Scanner(System.in);
//        System.out.print(("Enter No. 1:"));
//        int num1= in.nextInt();
//        System.out.print("Enter no. 2:");
//        int num2= in.nextInt();
//        System.out.println("The sum of both the no. is..." + (num1 + num2));
//        return 0;

    //passing parameters

    static int sum(int a, int b) {
        int product = a * b;
        System.out.println("Product is..." + product);
        return 0;
    }

    public static void main(String[] args) {
        int ans = sum(48, 38);
        System.out.println(ans);
    }

    // passing parameter in string datatype...

//        static String Mygreet(String name){
//            String Message= "Just greeeting the person yaar common...." + name;
//            return Message;
//        }
//
//    public static void main(String[] args) {
//        String greeting = Mygreet("Gourav Dash");
//        System.out.println(greeting);
//    }

}