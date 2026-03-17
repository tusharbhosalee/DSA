class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];

        right[n - 1] = 1;  
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] ans = new int[n];
        int left = 1;
        
        for (int i = 0; i < n; i++) {
            ans[i] = left * right[i];
            left = left * nums[i];
        }

        return ans;
    }
}