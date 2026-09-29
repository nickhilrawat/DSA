package love_babar_sheet;

import java.util.ArrayList;
import java.util.List;


// Given an array arr[]. Your task is to find the minimum and maximum elements in the array.
public class LB_02_Min_Max {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return new ArrayList<Integer>(List.of(min, max));
    }
}
