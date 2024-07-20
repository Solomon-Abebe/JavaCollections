package AlgorithmDSA.Sorting.Exercises;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // Early termination if no swaps occurred
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] generateData(String type, int size) {
        if (type.equals("sorted")) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = i;
            }
            return arr;
        } else if (type.equals("reverse_sorted")) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = size - i - 1;
            }
            return arr;
        } else if (type.equals("random")) {
            int[] arr = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(size);
            }
            return arr;
        } else {
            throw new IllegalArgumentException("Invalid data type!");
        }
    }

    public static void measurePerformance(int[] arr, String sortName) {
        long startTime = System.nanoTime();
        switch (sortName) {
            case "bubbleSort":
                bubbleSort(arr);
                break;
            case "selectionSort":
                selectionSort(arr);
                break;
            case "insertionSort":
                insertionSort(arr);
                break;
            default:
                throw new IllegalArgumentException("Invalid sort name!");
        }
        long endTime = System.nanoTime();
        System.out.println(sortName + " execution time: " + (endTime - startTime) + " nanoseconds");
    }

    public static void main(String[] args) {
        int size = 1000;

        for (String type : Arrays.asList("sorted", "reverse_sorted", "random")) {
            int[] arr = generateData(type, size);

            for (String sortName : Arrays.asList("bubbleSort", "selectionSort", "insertionSort")) {
                System.out.println("Data type: " + type);
                System.out.print("Original array: ");
                System.out.println(Arrays.toString(arr));
                measurePerformance(arr.clone(), sortName);
                System.out.print("Sorted array: ");
                System.out.println(Arrays.toString(arr));
                System.out.println();
            }
        }
    }
}