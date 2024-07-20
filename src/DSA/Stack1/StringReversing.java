package DSA.Stack1;

public class StringReversing {
    public static String stringReverse(String s){
        StringBuilder sb =new StringBuilder(s);
       return  sb.reverse().toString();
    }
    /*
    OR we can use stack
        Stack<Character> stack = new Stack<>();

        // Push characters onto the stack
        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack and append them to a StringBuilder
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

     */
    /*
    OR we can use two pointer approach
     char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        // Swap characters using two pointers
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
     */

    public static void main(String[] args) {
        String str= "SOLOMON";
        System.out.println(stringReverse(str));
    }
}
