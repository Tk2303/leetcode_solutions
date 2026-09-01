class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Clean the string (keep only alphanumeric, lowercase)
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Palindrome check using two-pointer method
        int left = 0, right = cleaned.length() - 1; // ✅ use cleaned.length()
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
