package AlgorithmDSA.GreedyAlgorithm;

public class FractionalKnapsackWithoutSorting {

    public static double fractionalKnapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        double maxValue = 0;

        while (capacity > 0) {
            int maxIndex = -1;
            double maxRatio = 0;

            // Find the item with the highest value-to-weight ratio
            for (int i = 0; i < n; i++) {
                double ratio = (double) values[i] / weights[i];
                if (weights[i] > 0 && ratio > maxRatio) {
                    maxRatio = ratio;
                    maxIndex = i;
                }
            }

            // If no suitable item found, break
            if (maxIndex == -1) {
                break;
            }

            // Calculate how much of the item can be added to the knapsack
            int amountToAdd = Math.min(weights[maxIndex], capacity);
            maxValue += amountToAdd * maxRatio;

            // Update knapsack capacity and item weight
            capacity -= amountToAdd;
            weights[maxIndex] -= amountToAdd;
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;

        double maxValue = fractionalKnapsack(weights, values, capacity);
        System.out.println("Maximum value in knapsack: " + maxValue);
    }
}
