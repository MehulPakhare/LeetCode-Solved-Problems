class Solution {
    public int minStartValue(int[] nums) {
        int minVal = 0, total = 0;

        for(int x : nums){
            total += x;
            minVal = Math.min(minVal, total);
        }

        return Math.abs(minVal) +1;
        
    }
}