class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robber(nums, nums.length-1, dp);
    }
    int robber(int[] nums, int idx, int[] dp){
        if(idx<0){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int dontTake = robber(nums, idx-1, dp);
        int take = nums[idx]+robber(nums, idx-2, dp);
        dp[idx] = Math.max(dontTake, take);
        return dp[idx];
    }
}
