package AlgorithmDSA.Sorting;


import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {// since it swaps two elements at once it can be n-2
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] <= arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

//            System.out.println("Selection Sort: " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 3, 2,11, 9, 8,1};
        selectionSort(nums);
        System.out.println("Selection Sort: " + Arrays.toString(nums));
    }
}