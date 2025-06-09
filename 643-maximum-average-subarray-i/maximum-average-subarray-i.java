class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double calc = 0;
        double ans = 0;
        for(int i =0; i < k; i++){
            calc += nums[i];
        }
        ans = calc;

        for(int i = k; i < nums.length;i++){
            calc += nums[i] - nums[i-k];
            ans = Math.max(calc, ans);
        }

        return ans/k;

    }
}