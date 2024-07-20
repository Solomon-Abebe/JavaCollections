package DSA;

import java.util.Stack;

public class StacksInJava {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("me");
        stack.push("you");
        stack.push("55");

        System.out.println(stack);
        System.out.println(stack.size());
        stack.pop();
        System.out.println("added:"+ stack.push("80"));
        System.out.println(stack);
        System.out.println(stack.size());


    }
}
