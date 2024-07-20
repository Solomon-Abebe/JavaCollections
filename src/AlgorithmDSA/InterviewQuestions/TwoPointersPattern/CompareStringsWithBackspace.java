package AlgorithmDSA.InterviewQuestions.TwoPointersPattern;
/*
 Two Pointers pattern to solve the problem of comparing strings that contain backspaces in Java:
 */
public class CompareStringsWithBackspace {

    public static boolean compareStrings(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }

            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }

            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j)) {
                return false;
            }

            if ((i >= 0) != (j >= 0)) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        boolean result = compareStrings(S, T);
        System.out.println("Are strings equal after backspace comparison? " + result);
    }
}
