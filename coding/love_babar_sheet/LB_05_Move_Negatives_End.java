package love_babar_sheet;

// Given an unsorted array arr[ ] having both negative and positive integers.
// Place all negative elements at the end of the array without changing the order of positive elements
// and negative elements.

// Expected Complexities
// Time Complexity: O(n)
// Auxiliary Space: O(n)

public class LB_05_Move_Negatives_End {
    public void segregateElements(int[] arr) {
        // code here
        int[] res = arr.clone();

        int i = 0;

        for( int val : res){
            if(val >= 0){
                arr[i] = val;
                i++;
            }
        }
        for( int val : res){
            if(val < 0){
                arr[i] = val;
                i++;
            }
        }
    }
}
