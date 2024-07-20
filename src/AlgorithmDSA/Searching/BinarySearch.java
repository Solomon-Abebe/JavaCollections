package AlgorithmDSA.Searching;

public class BinarySearch {
    public static int binarySearch(int []arr, int target){
        int low = 0;
        int high = arr.length-1;

        while (low<= high){
            int mid = low+(high-low)/2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid]<target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 9, 10, 10,12};
        int key =7;
        int result=binarySearch(arr,key);
        System.out.println(result);
    }
}
