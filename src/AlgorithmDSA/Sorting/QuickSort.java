package AlgorithmDSA.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);// partition index
            quickSort(arr, low, pi - 1);// overloading
            quickSort(arr, pi + 1, high);// overloading
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];//pivot is at index high
        int i = low -1;
       // System.out.println("Pivot: " + pivot);
        for (int j = low; j < high; j++) {// j should not include the pivot itself into the recursion
            // as it results in infinite recursion and thereby stackOverFlow problem
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
//            System.out.println("Array after iteration " + (j - low +1) + ": " + Arrays.toString(arr));
//            System.out.println(" value of i after iteration: "+ i);
//            System.out.println(" value of j after iteration: "+ j);
//            System.out.println("Quick Sort: " + Arrays.toString(arr));
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        //System.out.println("Array after partitioning: " + Arrays.toString(arr));
       // System.out.println("Value of i after partitioning: "+i);
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 11,13, 9, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(arr));
      //  System.out.println(partition(arr,0,arr.length-1));
    }
}