package love_babar_sheet;

// Given an array arr[], rotate the array by one position in clockwise direction.

// Expected Complexities
// Time Complexity: O(n)
// Auxiliary Space: O(1)

public class LB_07_Rotate_Array_by_1 {

    private void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public void left_rotate(int[] arr) {

        int len = arr.length - 1;
        // use the revsersal algorithm
        // reverse d block, here d = 1
        int d = 1;
        d = d % len;
        // reverse d block, here d = 1
        reverse(arr, 0, d-1);
        // reverse the first n-d block
        reverse(arr, d, len);

        // reverse the whole array
        reverse(arr, 0, len);
    }

    public void right_rotate(int[] arr) {
        int len = arr.length;

        if (len <= 1) {
            return;
        }

        int d = 1;

        // Reverse the whole array
        reverse(arr, 0, len - 1);

        // Reverse first d elements
        reverse(arr, 0, d - 1);

        // Reverse remaining elements
        reverse(arr, d, len - 1);
    }
}
