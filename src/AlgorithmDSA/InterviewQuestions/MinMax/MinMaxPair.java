package AlgorithmDSA.InterviewQuestions.MinMax;

public class MinMaxPair {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 3, 4, 6, 1};
        Pair result = minMax(array);
        System.out.println("Min: " + result.min);
        System.out.println("Max: " + result.max);
    }

    static class Pair {
        int min;
        int max;

       public Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    static Pair minMax(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            else
                max = a[i];

        }

        return new Pair(min, max);
    }
}