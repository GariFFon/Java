package Linear_Search_Algo;

import java.util.Arrays;

public class Search_In_String {
    public static void main(String[] args) {
        String name= "Gourav";
        char target = 'G';
        System.out.println(Search(name , target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Search2(name, target));


    }

    //Using toCharArray Command

    static boolean Search2(String name, char target){
        if (name.isEmpty()){
            return false;
        }
        for(char ch: name.toCharArray()){
            if (ch == target){
                return true;
            }
            // System.out.println(Arrays.toString(name.toCharArray()));...
                // helps to form each char of name in an element of a array...

            // this for loop is used to iterate on single character in the name...
            // this is possible coz of 1st comment "sout command"
        }
        return false;
    }


        //using for loop

    static boolean Search(String name, char target){
        if (name.isEmpty()){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
