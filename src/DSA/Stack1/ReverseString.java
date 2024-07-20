package DSA.Stack1;

import java.util.Stack;

public class ReverseString {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char []ch = str.toCharArray();

        // Push all characters of the string onto the stack
        for (int i=0; i<ch.length; i++) {
            stack.push(ch[i]);
        }

        // Pop all characters from the stack and form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }
}
