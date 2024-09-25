package Overloading;

public class Overloading { // when you have funtions of same name with same return type
    // but different arguments.. that is called overloading
    // also if the arguemtns are of same type then it will see the no. of arguments....
    public static void main(String[] args) {

        funtion(90);
        funtion("String number");
    }

    static void funtion(int a){
        System.out.println(a);
    }
    static void funtion(String a){
        System.out.println(a);
    }
}
