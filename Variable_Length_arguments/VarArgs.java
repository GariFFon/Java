package Variable_Length_arguments;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        Arr(9,21,231,321,3213,23,43,43);
    }

    static void Arr(int ...Ar){ //If we don't know the number of inputs we have to give in...
        // like we don't know the number of elements we have to enter in the array..
        System.out.println(Arrays.toString(Ar));
    }

    //multiple arguments

//    public static void main(String[] args)
//    {
//        multiple(9,101,"Kunal","Gourav","Raj","Suhani","KK");
//    }

    static void multiple(int a, int b, String ...A){ //Rule 1: Variable length arguments shuould always comes in the end..
        // for ex we will not know when b will come if the order is (int a, String ...A,int b) remember carefully Gourav
        System.out.print(a);
        System.out.print(b);
        System.out.print(Arrays.toString(A));
    }
}
