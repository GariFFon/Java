package Loops;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the desire no. :  ");
        int n=in.nextInt();
        for (int i=1; i<=n;){
            if (i==1){
                System.out.println(i);
                i++;
            }else {
                System.out.print(i + " ");
                i++;
            }
        }
    }
}
