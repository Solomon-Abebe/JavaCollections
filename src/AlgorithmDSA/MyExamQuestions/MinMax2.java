package AlgorithmDSA.MyExamQuestions;

public class MinMax2 {
    static class Pair2 {
        int min;
        int max;

        Pair2(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public static Pair2 minMax2(int[] a) {
            int min = a[0];
            int max = a[0];
            for (int i = 1; i < a.length; i++) {
                if (min >= a[i]) {
                    min = a[i];
                } else
                    max = a[i];
            }
            return new Pair2(min, max);
        }

        public static void main(String[] args) {
            int[] arr = {1, 5, 6, 7, 50};

            Pair2 resultPair = minMax2(arr);
            System.out.println("Max Element: "+resultPair.max);
            System.out.println("Min Element: "+resultPair.min);
        }
    }
}