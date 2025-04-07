class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int left = 0 , right = 0, sumCW = 0, res =Integer.MAX_VALUE;

       for(right = 0; right < nums.length; right++){
        sumCW += nums[right];
       

       while(sumCW >= target){
        res = Math.min(res, right-left +1);
        sumCW -= nums[left++];
       }
       }

        if (res == Integer.MAX_VALUE) {
            return 0;
        } else {
            return res;
        }       
    }
}