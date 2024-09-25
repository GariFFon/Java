package Funtions_Methods;

import java.util.Scanner;

public class Swap_Numbers {

        //using without any funtions...

//    public static void main(String[] args) {
//        Scanner in= new Scanner(System.in);
//        System.out.print("Enter first number 'A': ");
//        int a=in.nextInt();
//        System.out.print("Enter Second number 'B': ");
//        int b = in.nextInt();
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("After Swapping The Number A nd B are:" + a +" "+b);
//    }

        //Using funtions with parameters

    static int swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(("After Swapping the numbers are... A= "+a+" B= "+b));
        int temp1 =a;
        a=b;
        b=temp1;
        System.out.println(("We have Swapped again the number are... A= "+a+" B= "+b));
        return 0;
    }

         //main body ->

    public static void main(String[] args) {
        int pass=swap(100,20);
        System.out.println(pass);

    }
}
