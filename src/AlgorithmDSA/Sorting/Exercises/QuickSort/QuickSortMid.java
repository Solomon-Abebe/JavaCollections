package AlgorithmDSA.Sorting.Exercises.QuickSort;

import java.util.Arrays;

public class QuickSortMid {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Find the middle element and swap it with the first element (potential pivot)
        int mid = (low + high) / 2;
        swap(arr, low, mid);

        int pivot = arr[low]; // Now first element is the pivot
        int i = (low + 1); // Index of smaller element

        for (int j = low + 1; j <= high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
                i++;
            }
           // System.out.println("Quick Sort: " + Arrays.toString(arr));
        }

        // Swap arr[i - 1] (previous i) and arr[low] (pivot)
        swap(arr, i - 1, low);

        return i - 1; // Return the partition index
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 11, 9, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(arr));
        //System.out.println(partition(arr,0,arr.length-1));
    }
}