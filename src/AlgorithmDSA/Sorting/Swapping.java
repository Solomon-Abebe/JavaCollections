package AlgorithmDSA.Sorting;

import java.util.Arrays;

public class Swapping {
    public static int[] swapp(int []arr, int i, int j){
        int temp= arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        return arr;
    }


    public static void main(String[] args) {
        int []arr= {5,6,7,8,9,3};
        System.out.println((Arrays.toString(swapp(arr, 0, 1))));
    }
}
