package Search_Algorithms.Binary_Search_Algo.Binary_Search_Algo_Imp_Question;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class Peak_Index_Bitonic_Array {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                //you are in the decreasing part of the array...
                //this may be the answer but look at the left
                // this is why end != mid -1;
                end = mid;
            } else {
                //you are in the ascending part of the array...
                start = mid + 1;
                //because mid + 1 element > middle element
            }
        }
        //In the end, start == end and pointing towards the largest number because of the 2 check above.
        //start and end are always trying to find the max element in the above 2 checks.
        //hence, when they are pointing to just one element, that is the max one.
        // because that is what is above 2 checks say.
        //More elaboration: at every point of time for start and end, they have the best possible answer till that time.
        //And if we are saying that only one item is remaining,Hence cuz of above line that is the best possible answer.
        return start; //you can return end also as both of them is equal.
    }
}
