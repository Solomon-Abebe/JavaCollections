package AlgorithmDSA.Sorting.Exercises.MergeSort;

import java.util.Arrays;

public class InversionCount {
    /*
    Inversion Count:
Given an array of integers, determine the number of inversions present in the array.
An inversion occurs if there are two elements arr[i] and arr[j] such that i < j but arr[i] > arr[j].
Use the Merge Sort algorithm to solve this problem efficiently.
     */

    public static int countInversions(int[] arr) {
        return mergeSortAndCountInversions(arr, 0, arr.length - 1);
    }

    private static int mergeSortAndCountInversions(int[] arr, int left, int right) {
        int inversions = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            inversions += mergeSortAndCountInversions(arr, left, mid); // Count inversions in left half
            inversions += mergeSortAndCountInversions(arr, mid + 1, right); // Count inversions in right half

            inversions += mergeAndCountSplitInversions(arr, left, mid, right); // Count split inversions
        }
        return inversions;
    }

    private static int mergeAndCountSplitInversions(int[] arr, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        int inversions = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
                inversions += mid - (left + i) + 1; // Count split inversions
            }
        }

        while (i < leftArray.length) {
            arr[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            arr[k++] = rightArray[j++];
        }

        return inversions;
    }

    public static void main(String[] args) {
        int[] arr = {8, 10, 4, 6, 9, 11, 10, 12};
        int inversionCount = countInversions(arr);
        System.out.println("Inversion count: " + inversionCount);
    }
}
    //////////////////////////////////////////////////////////////////

    /*public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int n = arr.length;
            int mid = n / 2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int i = mid; i < n; i++) {
                right[i - mid] = arr[i];
            }
            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);

        }
    }

    private static int merge(int[] arr, int[] left, int[] right) {
        int inversionC=0;
        int i=0, j=0,k=0;
        while(i< left.length && j< right.length){
            if (left[i]<=right[j]){
                arr[k++]=left[i++];
            } else if (left[i] > right[j] && i++ < j++) {
                inversionC++;
            } else {
                arr[k++] =right[j++];
            }
        }
        while(i< left.length){
            arr[k++] = left[i++];
        }
        while(j< right.length){
            arr[k++] = right[j++];
        }
        return inversionC;

    }

    public static void main(String[] args) {
        int[]arr = {8,10,4,6,9,11,10, 12};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}*/