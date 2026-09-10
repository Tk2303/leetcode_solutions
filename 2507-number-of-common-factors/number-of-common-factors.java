class Solution {
    public int commonFactors(int a, int b) {
        int n = Math.min(a, b);  // common factors can't exceed the smaller number
        int count = 0;
        
        for (int x = 1; x <= n; x++) {
            if (a % x == 0 && b % x == 0) {
                count++;
            }
        }
        
        return count;
    }
}
