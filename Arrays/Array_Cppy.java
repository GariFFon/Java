package Arrays;

import java.util.*;
public class Array_Cppy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String copyfrom[] = {"Hi","My","Name","is","Gourav"};
        String copyto[] = new String[copyfrom.length];

        System.arraycopy(copyfrom,1,copyto,1,4);
        System.out.println(Arrays.toString(copyfrom));
        System.out.println(Arrays.toString(copyto));
        System.out.println(copyto.getClass().getName());
        if(copyfrom[1] == copyto[1])
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
