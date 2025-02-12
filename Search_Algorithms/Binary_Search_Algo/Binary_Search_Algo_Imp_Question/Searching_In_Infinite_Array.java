package Search_Algorithms.Binary_Search_Algo.Binary_Search_Algo_Imp_Question;

public class Searching_In_Infinite_Array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target= 10;
        System.out.println(ans(arr,target));
    }
    static int ans (int[] arr , int target){
        //first find the range
        //first the size fo the box is 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target >= arr[end]){
            int newStart = end + 1; //this is my new start
            //double the box value
            //end value = previous value + sizeofbox * 2...
            end = end + (end -start + 1) * 2;
            start = newStart;
        }
        return BinarySearch(arr,target,start,end);
    }
    //return the index.
    //return -1 if it does not exist.
    static int BinarySearch(int[] arr, int target,int start, int end){
        //To Find the middle element...
        while (start <= end){
//            int mid = (start + end) / 2;
//      Now what if this (start + end) exceeds the range of integer value in java

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }else{
                //middle element is the answer
                return mid;
            }
        }
        return -1;
    }
}
