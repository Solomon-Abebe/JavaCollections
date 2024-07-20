package AlgorithmDSA.Searching.Interview;

import java.util.HashSet;

public class MyMethod {
    public static int myMethod(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements of arr2 to the set
        for (int num : arr2) {
            set.add(num);
        }

        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;

        // Find the smallest number in arr1 that is not present in arr2
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < minValue && !set.contains(arr1[i])) {
                minValue = arr1[i];
                minIndex = i;
            }
        }

        return minIndex;
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
