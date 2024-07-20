package AlgorithmDSA.Sorting.Exercises.InsertionSoert;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 3, 11, 9, 8,0};
        insertionSort(nums);
        System.out.println("Insertion Sort: " + Arrays.toString(nums));
    }
}
