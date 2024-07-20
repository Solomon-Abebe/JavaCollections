package AlgorithmDSA.Searching;

public class BinarySearchBoolean {
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 9;
        System.out.println(binarySearch(arr, target)); // Output: true
        target = 8;
        System.out.println(binarySearch(arr, target)); // Output: false
    }
}