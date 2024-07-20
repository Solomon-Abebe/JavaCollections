package AlgorithmDSA.Recursion;

import java.math.BigInteger;

public class Factorial {
  /*  //THIS IS FOR LARGE NUMBERS
  public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }*/
    public static int factorial(int n){
        if(n==0)return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 25; // You can increase 'n' to calculate factorials of larger numbers
        System.out.println(factorial(n));
    }
}
