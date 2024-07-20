package AlgorithmDSA.MyExamQuestions;
/*
Write a method that takes an array of integers and returns 1
 if the array has an even length and can be split into two halves such that the sum
 of the elements in the left half is equal to the sum of the elements in the right half.
 Otherwise, return 0.
 */
public class Exam3 {
    public static void main(String[] args) {
        System.out.println(answerThree(new int[]{5,4,3,2,3,4,6,1}));

    }
    static int answerThree(int[]a){
        int leftSum=a[0];
        int rightSum=a[a.length-1];
        if (a.length%2!=0)return 0;
        for (int i = 1; i < a.length-1; i++) {
            if (i < a.length / 2)
                leftSum += a[i];
            else
                rightSum+=a[i];
        }

        if (rightSum==leftSum)
            return 1;
        return 0;
    }
}
