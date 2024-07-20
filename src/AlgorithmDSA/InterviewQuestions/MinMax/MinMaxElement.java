package AlgorithmDSA.InterviewQuestions.MinMax;

import java.util.Arrays;

public class MinMaxElement {
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int min = arr[0]; // Assume the first element is the minimum

        // Iterate through the array to find the minimum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = arr[0]; // Assume the first element is the maximum

        // Iterate through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 1, 9, 4};

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Minimum element: " + findMin(arr));
        System.out.println("Maximum element: " + findMax(arr));
    }
}
