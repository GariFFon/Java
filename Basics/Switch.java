package Basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        //Fruit

//        System.out.println("Enter you favourite fruit: ");
//        String n= in.next();
//
//        switch (n){
//            case ("Mango"),("mango") -> System.out.println("Very juicy");
//            case ("Apple"),("apple") -> System.out.println("Good fruit");
//            case ("Orange"),("orange") -> System.out.println("Yummy fruit");
//            default -> System.out.println("Enter the valid fruit");
//        }

            //Days

//        System.out.println("Enter the Day: ");
//        String m=in.next();

//        switch (m){
//            case ("Monday"),("Tuesday"),("Wednesday"),("Thursday"),("Friday") -> System.out.println("Weekdays");
//            case ("Saturday"),("Sunday") -> System.out.println("Weekends");
//            default -> System.out.println("Enter Valid name of the day.");
//        }

        //Nested Switch

        System.out.println("Enter Employee id: ");
        int empid=in.nextInt();

        switch (empid) {
            case 1:
                System.out.println("Good");
                break;
            case 2:
                System.out.println("Better");
                break;
            case 3:
                System.out.println("Enter Department name: ");
                String department=in.next();
                switch (department){
                    case ("IT"):
                        System.out.println("Good");
                        break;
                    case ("Management"):
                        System.out.println("Better");
                        break;
                    case ("Financial"):
                        System.out.println("Best");
                        break;
                    default:
                        System.out.println("Enter Valid Department Name.");
                        break;

                }
            default:
                System.out.println("Enter Valid Employee id.");
                break;
        }
    }
}
