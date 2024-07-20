package DSA.Stack1;
import java.util.Stack;
public class RemoveParenthesis {

        public static String removeOuterParentheses(String s) {
            char[] result = new char[s.length()];
                int index = 0;
                Stack<Integer> stack = new Stack<>();

                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c == '(') {
                        stack.push(i);
                        if (stack.size() > 1) { // Avoid adding the outermost '('
                            result[index++] = c;
                        }
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) { // Avoid adding the outermost ')'
                            continue;
                        }
                        result[index++] = c;
                    }
                }

                return new String(result, 0, index);
            }

            public static void main(String[] args) {
                // Example 1
                String s1 = "(()())(())";
                System.out.println(removeOuterParentheses(s1));  // Output: "()()()"

                // Example 2
                String s2 = "(()())(())(()(()))";
                System.out.println(removeOuterParentheses(s2));  // Output: "()()()()(())"

                // Example 3
                String s3 = "()()";
                System.out.println(removeOuterParentheses(s3));  // Output: ""
            }
        }
