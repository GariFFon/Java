package Shadowing;

public class Shadow {
    static int x=90; //This will be shadowed at line 8.

    public static void main(String[] args) {
        System.out.println(x);
        int x=40;// this class variable at line 4 has shadowed by this line...
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
