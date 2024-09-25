package Condition_Statements;
import java.util.Scanner;
public class Condition_IF {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        float a = inputs.nextFloat();
        if (a>1) {
            System.out.println("The Input value is greater than 1.");
        }
        else if (a==1){
            System.out.println("The Input value is equal to 1.");
        }
        else {
            System.out.println("The Input value is less than 1.");
        }
    }
}