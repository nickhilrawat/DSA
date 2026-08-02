import java.util.ArrayList;
import java.util.List;

public class QuickSort{

    public static void main(String[] args) {
        int arr[] = {6,3,2,4,1,5};
        quickSort(arr, 0, 5);

        for(int i : arr){
            System.out.print(i + " ");
        }

    }
    private static void quickSort(int[] arr, int low, int high) {
        int s = low;
        int e = high;

        if(s >= e){
            return;
        }
        // partitioning on the basis of arr
        int pivotIndex = partition(arr, s, e);

        // left part sorting via recursion
        quickSort(arr, s, pivotIndex-1);
        //right part sorting via recursion
        quickSort(arr, pivotIndex+1, e);
    }

    private static int partition(int[] arr, int low, int high) {
        int s = low;
        int e = high;

        // making first element as the pivor element
        int pivotElement = arr[s];

        int count = 0;

//        count how many elements are less than the pivot
        for (int i = s+1; i<=e ; i++){
            if(arr[i] <= pivotElement){
                count++;
            }
        }
        int correctPosition = s + count;

        int temp = arr[correctPosition];
        arr[correctPosition] = arr[s];
        arr[s] = temp;

        int i = s;
        int j = e;

        while(i < correctPosition && j > correctPosition){
            while(arr[i] < pivotElement) {
                i++;
            }
            while(arr[j] > pivotElement) {
                j--;
            }
            if(i < correctPosition && j > correctPosition){
                temp = arr[i];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
        }
        return correctPosition;
    }
}