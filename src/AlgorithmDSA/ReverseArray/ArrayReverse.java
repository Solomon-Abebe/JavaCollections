package AlgorithmDSA.ReverseArray;

import java.util.Arrays;

public class ArrayReverse {
    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move start index to the right
            start++;
            // Move end index to the left
            end--;
        }
        return arr;
    }

//    public static void printArray(int[] arr) {
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println("Original array:");
//        printArray(arr);
        // Reverse the array
       int[]result= reverseArray(arr);
        System.out.println("Reversed array: "+ Arrays.toString(result));
        //printArray(arr);
    }
}
