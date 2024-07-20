package AlgorithmDSA.Sorting.Exercises.MergeSort;

import java.util.Arrays;

public class MergingTwoArrays {
    public static int[] mergeTwoArrays(int []arr1, int[]arr2){
        int i=0,j=0, k=0;
        int[] arr= new int[arr1.length+ arr2.length];
        while(i< arr1.length && j< arr2.length){
            if (arr1[i]<=arr2[j]){
                arr[k++]=arr1[i++];
            }else {
                arr[k++]=arr2[j++];
            }
        }
        // copy remaining elements of arr1
        while (i<arr1.length)
            arr[k++]= arr1[i++];
        //copy remaining elements of arr2 into the merged array
        while (j<arr2.length)
            arr[k++]=arr2[j++];

        return arr;
    }

    public static void main(String[] args) {
        int []arr1 ={1, 3, 5, 7};
        int []arr2 = {2, 4, 6, 8,10};
        int []arr = mergeTwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr));
    }
}
