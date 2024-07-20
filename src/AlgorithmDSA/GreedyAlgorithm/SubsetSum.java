package AlgorithmDSA.GreedyAlgorithm;

public class SubsetSum {

    public static int subsetSum(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;

        // Manual sorting (Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i- 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Iterate through the sorted array and greedily pick elements to include in the subset
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == target) {
                return sum;// you can make it boolean
            } else if (sum > target) {
                // If the sum exceeds the target, backtrack and exclude the last included element
                sum -= nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int target = 9;

        int existsSubset = subsetSum(nums, target);
        if (existsSubset==target) {
            System.out.println("Subset with the target sum exists."+existsSubset);
        } else {
            System.out.println("No subset with the target sum exists.");
        }
    }
}