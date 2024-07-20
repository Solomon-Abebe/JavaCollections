package AlgorithmDSA.Searching;

public class LinearSearch {

    public static int linearSearch(int []arr, int key){
        //int index=-1;
        for (int i=0; i< arr.length;i++) {
            //index++;
            if (key == arr[i]) {
                return i;

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 10, 9, 12};
        //int key =9;
        int result=linearSearch(arr,9);
        System.out.println(result);
    }
}
