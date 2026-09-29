package love_babar_sheet;

import java.util.Collections;
import java.util.PriorityQueue;


// Given an integer array arr[] and an integer k, find and return the kth smallest element in the given array.
public class LB_03_Kth_Element {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0 ;i<arr.length; i++){
            pq.add(arr[i]);

            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
