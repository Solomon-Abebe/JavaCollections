package AlgorithmDSA.Sorting.Exercises.QuickSort;

import java.util.Arrays;

public class QuickSortFirstElement {
    public static void quickSort(int []arr, int low, int high){
        if (low < high){
            int pivotIndex =partition(arr,low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low+1;// excluding the pivot
        for (int j = low+1; j <=high; j++) {// excluding the pivot
            if (arr[j]<=pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
          //  System.out.println("Quick Sort: " + Arrays.toString(arr));
        }
        int temp = arr[i-1];
        arr[i-1] = arr[low];
        arr[low] = temp;
        return i-1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 11, 9, 8, -3,0};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(arr));
        //System.out.println(partition(arr,0,arr.length-1));
    }
}
