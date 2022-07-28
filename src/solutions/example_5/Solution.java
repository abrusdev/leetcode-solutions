package solutions.example_5;

public class Solution {
    public String longestPalindrome(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String variant = s.substring(i, j);
                System.out.println(variant);
                if (checkToPalindrome(variant) && variant.length() > result.length()) {
                    result = variant;
                }
            }
        }
        return result;
    }

    public boolean checkToPalindrome(String variant) {
        boolean result = true;

        for (int i = 0; i < variant.length() / 2; i++) {
            if (variant.charAt(i) != variant.charAt(variant.length() - i - 1)) return false;
        }

        return result;
    }
}
