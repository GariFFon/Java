package Basics;


import java.util.Scanner;

public class Change_Value {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int k= change(arr);
        System.out.println(k);


    }

    static int change(int[] z){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the Index where you want to do the changes: ");
        int a= in.nextInt();
        System.out.print("Enter The number of change: ");
        int num= in.nextInt();

        int len = z.length;
        System.out.println("Length of array is.. "+len);
        if (a<0){
            System.out.println("Invalid Index");
        }
        else if (a>len){
            System.out.println("Invalid Index");
        }
        else{
            System.out.println("Changes...");
            z[a]= num;
        }

        for(int i=0; i<len;i++){
            int m=0;
            System.out.println("Index number "+m+" and value at that index = "+z[i]);
            m = m+ 1;
        }
        System.out.println(" ");
        return 1;
    }
}
