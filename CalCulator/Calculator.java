package CalCulator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // we are taking input form until and unless the user press the 'x' or 'X' .


        System.out.print("press 'Y' or 'y' to start: ");
        char c= in.next().trim().charAt(0);
        while (c == 'Y' || c == 'y') {
            System.out.println("Enter the Operation you want " +
                    "to perform A= addition;S= Subtraction;M= " +
                    "Multiplication;D= Division:");
            char op = in.next().trim().charAt(0);
            System.out.println("Enter Two Numbers: ");
            int a = in.nextInt();
            int b = in.nextInt();
            int ans = 0;
            if (op == 'A' || op == 'a') {
                ans = a + b;
                System.out.println("Sum is: " + ans);
            } else if (op == 'S' || op == 's') {
                ans = a - b;
                System.out.println("Difference is: " + ans);
            } else if (op == 'M' || op == 'm') {
                ans = a * b;
                System.out.println("Product is: " + ans);
            } else if (op == 'D' || op == 'd') {
                ans = a / b;
                System.out.println("Quotient is: " + ans);
            } else {
                System.out.println("Invalid Command");
            }
            System.out.println("Do you want to continue??");
            c = in.next().trim().charAt(0);
            if (c == 'X' || c == 'x') break;
            else {
                continue;
            }
        }
    }
}
