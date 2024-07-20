package AlgorithmDSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];

            // Fill left and right arrays
            for (int i = 0; i < mid; i++) {// manual array copy
                left[i] = arr[i];
            }
            // Or using system array copy

//             System.arraycopy(arr, 0, left, 0, mid);

            for (int i = mid; i < n; i++) {// manual array copy
                right[i - mid] = arr[i];
            }

            // Or using built in method of array copy
            // if (n - mid >= 0)
//             System.arraycopy(arr, mid, right, 0, n - mid);

            // Recursive calls
            mergeSort(left);
            mergeSort(right);

            // Merge sorted left and right arrays
            merge(arr, left, right);
        }
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge left and right arrays into arr
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];// uses k and i value first and next increments k and i- values(k++, i++) for future uses
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left array
        while (i < left.length) {// while(i<left.length) arr[k++] = left[i++];
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right array
        while (j < right.length) {// for(; j<right.length; j++) arr[k++]=right[j];
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,5,8,11};
        mergeSort(arr);
        System.out.println("Merge Sort: " + Arrays.toString(arr));
    }
}