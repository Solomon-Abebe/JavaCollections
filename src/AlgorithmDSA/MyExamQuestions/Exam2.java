package AlgorithmDSA.MyExamQuestions;
/*
Write a method that takes an array of integers and returns 1 if the following conditions are met:

* The first and last elements are both odd or both even.
* There is at least one instance of an odd element followed by an even element or at least
one instance of an even element followed by an odd element in the array.
Otherwise, return 0.
 */

public class Exam2 {
    public static void main(String[] args) {
        System.out.println(answerTwo(new int[]{6,8,5,12,1,10}));
        System.out.println(answerTwo(new int[]{7,8,17,32,6,21}));
        System.out.println(answerTwo(new int[]{4,21,33,6}));
    }

    static int answerTwo(int[] a) {
        if (a[0] % 2 != a[a.length - 1] % 2) return 0;
       // if (a[0] % 2 == 0 && a[a.length - 1] % 2 != 0) return 0;
        boolean preceded = false;
        boolean followed = false;
        for (int i = 1; i < a.length - 2; i++) {
            if (a[i] % 2 != 0) {
                if (a[i + 1] % 2 == 0) {
                    followed = true;
                    // break; this shouldn't be added
                }
            }
            else if (a[i + 1] % 2 != 0) {
                if (a[i] % 2 == 0) {
                    preceded = true;
                    // break; this shouldn't be added

                }
            }
        }
        if (!preceded || !followed)
            return 0;
        return 1;
    }
}