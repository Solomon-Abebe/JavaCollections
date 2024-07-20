package DSA.HashSet;

import java.util.HashSet;

public class MatchingElementsPrinter {

    public static void printMatchingElements(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                System.out.println(num);
            } else {
                seen.add(num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 5};
        printMatchingElements(arr);
    }
}