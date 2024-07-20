package AlgorithmDSA.Sorting.Exercises.QuickSort;

import java.util.Arrays;

public class QuickSortLastElement {
    public static int partition2(int[]arr, int low, int high){
        // this will return the index of the next pivot element
        int pivot = arr[high];
        int i = low-1;// iterates the index of the pivot
        for (int j = low; j <high ; j++) {
            if (arr[j] <= pivot){
                i++;
                swap2(arr, i, j);
            }
        }
        //out of the for-loop
        swap2(arr, i+1, high);
        return i+1;
    }
    public static void swap2(int[] arr, int i, int j){
        int temp2 = arr[i];
        arr[i] = arr[j];
        arr[j] = temp2;
    }
    public static void quickSort2( int[]arr, int low, int high){
        if (low<high) {
            int pi2 = partition2(arr, low, high);
            quickSort2(arr, low, pi2 - 1);
            quickSort2(arr, pi2 + 1, high);
        }
    }

    public static void main(String[] args) {
        int[]arr = {5, 2, 9, 1, 5, 6, 3};
        quickSort2(arr,0,arr.length-1);
        // writing the print system after the sorting method is called prints the sorted array as show below
        System.out.println(Arrays.toString(arr));

    }
}
