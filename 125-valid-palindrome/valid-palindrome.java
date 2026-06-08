class Solution {
    public boolean isPalindrome(String s) {
        // Preprocess: remove non-alphanumeric and lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = cleaned.length();

        // Check only half the string
        for (int i = 0; i < n / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
