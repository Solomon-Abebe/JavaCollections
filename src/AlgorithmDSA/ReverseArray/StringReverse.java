package AlgorithmDSA.ReverseArray;

public class StringReverse {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] characters = str.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // Swap characters
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // Move towards the center
            left++;
            right--;
        }

        return new String(characters);
    }
}