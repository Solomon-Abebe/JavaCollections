package AlgorithmDSA.InterviewQuestions.TwoPointersPattern;

import java.util.Arrays;

public class TwoPointerSquaringArray {
    public static int[] squareSortedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -2, 0, 3, 5};
        int[] result = squareSortedArray(nums);
        System.out.println("Original sorted array: " + Arrays.toString(nums));
        System.out.println("Squared sorted array: " + Arrays.toString(result));
    }
}