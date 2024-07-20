package AlgorithmDSA.InterviewQuestions.TwoPointersPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 Here's an example of finding triplets in an array that sum up to zero using
 the Two Pointers pattern algorithm in Java:
 */
public class TripletsSumToZero {
    public static List<List<Integer>> findTriplets(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1;
                int right = nums.length - 1;
                int targetSum = -nums[i];

                while (left < right) {
                    int currentSum = nums[left] + nums[right];

                    if (currentSum == targetSum) {
                        triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (currentSum < targetSum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return triplets;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = findTriplets(nums);
        System.out.println("Triplets that sum to zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}