package love_babar_sheet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// You are given two arrays a[] and b[], return the Union of both the arrays in any order.

public class LB_06_Union_Array {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> set = new HashSet<>();

        for(int i=0; i < a.length; i++){
            set.add(a[i]);
        }

        for(int i=0; i < b.length; i++){
            set.add(b[i]);
        }

        return (new ArrayList<>(set));
    }
}
