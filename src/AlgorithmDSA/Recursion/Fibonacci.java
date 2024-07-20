package AlgorithmDSA.Recursion;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n<=1) return n;
//        return (fibonacci(n-2)+fibonacci(n-1));

        int prev = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {

            int next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print(fibonacci(n) + " ");
        System.out.println("Fibonacci sequence up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
