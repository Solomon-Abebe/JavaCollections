package AlgorithmDSA.Searching.Interview;

public class MyMethod2 {
    public static int myMethod(int[] arr1, int[] arr2) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;

        // Find the smallest number in the first array that is not present in the second array
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < minValue && !contains(arr2, arr1[i])) {
                minValue = arr1[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    // Helper method to check if an array contains a specific value
    public static boolean contains(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 5, 2};
        int[] arr2 = {1, 7, 2, 8, 9};

        int resultIndex = myMethod(arr1, arr2);
        if (resultIndex != -1) {
            System.out.println("Index of the smallest number in arr1 not present in arr2: " + resultIndex);
            System.out.println("Smallest number: " + arr1[resultIndex]);
        } else {
            System.out.println("No such number found.");
        }
    }
}
