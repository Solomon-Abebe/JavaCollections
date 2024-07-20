package AlgorithmDSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {// n-1 increases efficiency as the last element gets sorted
            // by itself at the end of the process! but it is inbound for i<n.
            for (int j = 0; j < n-i-1; j++) {// j<n-1 keeps inbound as the swap is between j and j+1;
                // n-i keeps the sorted elements before the current i(0 to i) untouched(efficiency increase)
                if (arr[j]> arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
         // System.out.println("Bubble Sort: " + Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,1,4,2,8,9, 5, -2};
        bubbleSort(nums);
        System.out.println("Bubble Sort: " + Arrays.toString(nums));
    }
}
