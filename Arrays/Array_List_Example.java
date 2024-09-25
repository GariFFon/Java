package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(10);

//        list.add(100);
//        list.add(21);
//        list.add(31);
//        list.add(11);
//        list.add(10);
//        list.add(5);
//        list.add(2);
//        list.add(0);
//        list.add(11);
//        list.add(15);
//
//        System.out.println(list.contains(5));
//        //give true or false based on the given integer is in the list.
//        System.out.println(list);
//        // prints the whole list
//        list.set(0, 1);
//        // change the value of the zero index of the list.
//        list.remove(9);
//        // remove the given index value from the list.
//        System.out.println(list);
//

        //input

        for (int i=0; i < 5;i++){
            list.add(in.nextInt());
        }

        //get item at any index

        for (int j=0; j<5; j++){
            System.out.println(list.get(j));
            //get to retrieve the element from the given list by passing the index value in form of j.

        }
    }
}
