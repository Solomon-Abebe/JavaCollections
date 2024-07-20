package AlgorithmDSA.InterviewQuestions.SlidingWidowPattern;
/*
Given an array of positive integers and a target sum, find the minimum length of a contiguous subarray
whose sum is greater than or equal to the target sum.
 */
public class MinimumSizeSubArraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int windowSum = 0;

        for (int right = 0; right < n; right++) {
            windowSum += nums[right];
            while (windowSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                windowSum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int minLength = minSubArrayLen(target, nums);
        System.out.println("Minimum length of contiguous subarray with sum >= " + target + ": " + minLength);
    }
}