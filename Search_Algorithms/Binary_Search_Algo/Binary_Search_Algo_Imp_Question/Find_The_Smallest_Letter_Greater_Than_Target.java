package Search_Algorithms.Binary_Search_Algo.Binary_Search_Algo_Imp_Question;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Find_The_Smallest_Letter_Greater_Than_Target {

    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}

