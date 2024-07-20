package AlgorithmDSA.Sorting.Exercises.MergeSort;

import java.util.Arrays;

public class DescendingSort {
    public static void divide(int[] arr){
        int n= arr.length;
        if (n>1){
            int mid=n/2;
            int[]left = new int[mid];
            int[]right = new int[n-mid];
            //fill the left and right arrays
            for (int i = 0; i <mid ; i++) {
                left[i] = arr[i];
            }
            for (int j = mid; j <n; j++) {
                right[j-mid] = arr[j];   // j-mid
            }
            divide(left);
            divide(right);
            merge(arr,left,right);
        }
    }
    public static void merge(int[] arr, int[]left, int[]right){
        int i=0, j=0,k=0;
        while(i< left.length && j< right.length){
           if (left[i]<=right[j]){
               arr[k++]=right[j++];
           }else {
               arr[k++]=left[i++];
           }
        }
        while (i< left.length){
            arr[k++]=left[i++];
        }
        while (j< right.length){
            arr[k++]= right[j++];
        }
    }

    public static void main(String[] args) {
        int[]arr ={5, 3, 8, 2, 1, 9, 4, 6, 7};
        divide(arr);
        System.out.println(Arrays.toString(arr));
    }
}
