class Solution {
    public int maxSubArray(int[] nums) {
        int ms = nums[0];   // initialize with first element
        int cs = nums[0];   // current sum also starts with first element

        for (int i = 1; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]); // either start new subarray or extend
            ms = Math.max(ms, cs);                // update max sum
        }
        return ms;
    }
}
