class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] prefix = leftSum(nums);
        int[] suffix = rightSum(nums);

        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = Math.abs(prefix[i] - suffix[i]);
        }
        return ans;
    }
    public int[] leftSum(int[] nums){
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = 0;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        return prefix;
    }
    public int[] rightSum(int[] nums){
        int n = nums.length;
        int[] suffix = new int[n];
        suffix[n-1] = 0;
        for(int i = n - 2; i >= 0; i--){
            suffix[i] = suffix[i+1] + nums[i+1];
        }
        return suffix;
    }
}