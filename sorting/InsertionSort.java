import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    static void main() {
        List<Integer> arr = new ArrayList<>(List.of(1,2,4,5,3));

        insertionSort(arr, arr.size());

        for(int i=0 ;i< arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }

    private static void insertionSort(List<Integer> arr, int length) {
        int j,key;
        for(int i=1; i<length; i++) {
            key = arr.get(i); // taking first elment in the key
            j = i;
            while (j > 0 && (arr.get(j-1) > key)) {
                arr.set(j, arr.get(j-1));
                j--;
                for(int k=0 ;k< arr.size(); k++){
                    System.out.print(arr.get(k) + " ");
                }
                System.out.println();
            }
            arr.set(j, key);
        }
    }
}
