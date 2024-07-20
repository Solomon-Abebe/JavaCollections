package AlgorithmDSA.Sorting.Exercises.MergeSort;

import java.util.Arrays;

public class MergeSortImplementation {
    /*
    1. Merge Sort Implementation:
Implement the Merge Sort algorithm to sort an array of integers in non-decreasing order. Your implementation should
handle arrays of various sizes efficiently and correctly.
     */
    public static void mergeSort(int[]arr){
        if (arr.length>1){
            int n= arr.length;
            int mid = n/2;
            int[] left = new int[mid];
            int[] right = new int[n-mid];
            for (int i=0; i<mid; i++) {
                left[i] = arr[i];
            }
            for (int i = mid; i <n ; i++) {
                right[i-mid] = arr[i];
            }
            mergeSort(left);
            mergeSort(right);
            merge(arr,left,right);
        }
    }
    private static void merge(int[]arr, int[]left, int[]right){
        int i = 0, j = 0, k = 0;
        while (i<left.length && j< right.length){
            if(left[i]<= right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        while (i<left.length){
            arr[k++]=left[i++];
        }
        while (j<right.length){
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int []arr = {2,3,1,2,5,8,11};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
