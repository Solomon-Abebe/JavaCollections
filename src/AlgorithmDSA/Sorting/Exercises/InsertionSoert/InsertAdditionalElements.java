package AlgorithmDSA.Sorting.Exercises.InsertionSoert;

import java.util.Arrays;

public class InsertAdditionalElements {
    public static int[] insertionSortAdditionalElement(int[] sortedArray, int[] newElements) {
        int sortedLength = sortedArray.length;
        int newLength = newElements.length;

        // Create a new array to hold the sorted elements including new elements
        int[] mergedArray = new int[sortedLength + newLength];

        // Copy existing sorted elements into the mergedArray
        for (int i = 0; i < sortedLength; i++) {
            mergedArray[i] = sortedArray[i];
        }

        // Copy new elements into the mergedArray
        for (int i = 0; i < newLength; i++) {
            mergedArray[sortedLength + i] = newElements[i];
        }
        // Perform insertion sort on the merged array
        for (int i = 1; i < mergedArray.length; i++) {
            int key = mergedArray[i];
            int j = i - 1;

            while (j >= 0 && mergedArray[j] > key) {
                mergedArray[j + 1] = mergedArray[j];
                j--;
            }
            mergedArray[j + 1] = key;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9};
        int[] newElements = {2, 4, 6};
     int[]result=   insertionSortAdditionalElement(sortedArray, newElements);
        System.out.println("Sorted Array with New Elements: " +
                Arrays.toString(result));
        // Expected Output: [1, 2, 3, 4, 5, 6, 7, 9]
    }
}
