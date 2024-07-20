package AlgorithmDSA.InterviewQuestions.SlidingWidowPattern;

import java.util.HashSet;
import java.util.Set;

public class ShowLongestSubstring {
    public static String longestSubstringWithoutRepeating(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int start = 0;
        int end = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
                end = right + 1;
            }
        }

        return s.substring(start, end) +  " \n(Length: " +  maxLength + ")";
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String longestSubstring = longestSubstringWithoutRepeating(s);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }
}