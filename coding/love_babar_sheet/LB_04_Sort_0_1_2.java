package love_babar_sheet;

// Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

public class LB_04_Sort_0_1_2 {
    public void sort012(int[] arr) {
        // code here
        int len = arr.length;
        int low = 0;
        int mid = 0;
        int high = len-1;

        while(mid <= high){
            if(arr[mid] == 0){
                // swap low and mid
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                // increment mid and low
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                // increment mid
                mid++;
            }
            // power of else, if using else if here causes TLE
            else {
                 // swap high and mid
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                // decrement high
                high--;
            }
        }
    }
}