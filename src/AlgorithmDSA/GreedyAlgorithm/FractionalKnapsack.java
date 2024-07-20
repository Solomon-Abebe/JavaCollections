package AlgorithmDSA.GreedyAlgorithm;

public class FractionalKnapsack {

    static class Item {
        int weight;
        int value;
        double ratio;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
            this.ratio = (double) value / weight;
        }
    }

    // Manual implementation of comparing items based on ratio using bubble sort/
    // use merge sort or quick sort for less time complexity
    public static void sortItems(Item[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[j].ratio > items[i].ratio) {
                    Item temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
    }

    // Manual implementation of finding minimum value
    public static int findMin(int a, int b) {
        return a < b ? a : b;// return Math.min(a, b);
    }

    public static double getMaxValue(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(weights[i], values[i]);
        }

        sortItems(items);

        double totalValue = 0;
        int remainingCapacity = capacity;

        for (Item item : items) {
            if (remainingCapacity <= 0) {
                break;
            }
            int weightTaken = findMin(item.weight, remainingCapacity);
            totalValue += ((double) weightTaken / item.weight) * item.value;// double is for the weight taken
            remainingCapacity -= weightTaken;
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;

        double maxValue = getMaxValue(weights, values, capacity);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
}
