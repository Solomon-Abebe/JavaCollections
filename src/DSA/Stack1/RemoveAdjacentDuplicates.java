package DSA.Stack1;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // Remove the top character from the stack
            } else {
                stack.push(c); // Push the current character onto the stack
            }
        }

        // Construct the resulting string from the characters remaining in the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Insert characters at the beginning of the StringBuilder
        }

        return result.toString(); // Convert StringBuilder to string and return
    }

    public static void main(String[] args) {
        RemoveAdjacentDuplicates solution = new RemoveAdjacentDuplicates();

        String s1 = "ababaccaa";
        System.out.println(solution.removeDuplicates(s1)); // Output: "ca"

        String s2 = "bcabc";
        System.out.println(solution.removeDuplicates(s2)); // Output: "ay"
    }
}
