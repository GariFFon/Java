package Scope;

public class Method_Scope_notes {
    public static void main(String[] args) {
//
//    // block scope
//
////intialization
//
//        int a=90;
//        int b=10;
//        {
//            int a=80;
//            // already initialized outside the block, hence you cannot initialized it again.
//            // but you can change the values easily.
////updates
//            a= 100;
//
//
//            int c=80;
//            //values initialized in this block will remain only in this block.
//        }
//        // System.out.println(c);
//        // cannot used outside the block.
//
//        //Now lets do scoping in for loops...
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
//            int name=100;
//            int a =70; // cannot initialized it again and again.
//        }
    }
}
// Anything that is initialized out of the block or loop cannot be initialized again.
//just like Global and local variable...
// Anything that is initialized inside the block or loop cannot be used outside the block or loop.
