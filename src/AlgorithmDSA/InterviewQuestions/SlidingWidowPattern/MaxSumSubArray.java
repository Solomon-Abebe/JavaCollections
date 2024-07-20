package AlgorithmDSA.InterviewQuestions.SlidingWidowPattern;

public class MaxSumSubArray {
    public static int maxSumSubarray(int[] nums, int k) {
        int n = nums.length;
        if (n < k || k <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        int windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int k = 3;
        int maxSum = maxSumSubarray(nums, k);
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSum);
    }
}