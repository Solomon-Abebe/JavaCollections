package AlgorithmDSA.InterviewQuestions.SlidingWidowPattern;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + maxLength);
    }
}
