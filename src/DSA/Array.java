package DSA;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int size = 1;
        int[] data = new int[3];

        data[0]=2;// if the value is 0 it is assigned by default no need to assign
        data[1] = 7;
        data[++size] = 9;
        System.out.println("The value of size is: " + size); //Output: 0
        System.out.println("The content of data is: " + Arrays.toString(data)); //Output: [9, 7, 0]
    }
}
