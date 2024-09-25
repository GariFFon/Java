
package Important_Basics;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check whether the number is armstrong number or not...");
        int num = in.nextInt();
        System.out.println(armstrong(num));
    }

    static boolean armstrong(int n) {
        int original= n;
        int sum=0;

        while (n > 0) {
            int rem= n%10;
            n=n/10;
            sum=sum + rem*rem*rem;
        }
        if (sum == original){
            return true;
        }
        return false;
    }
}