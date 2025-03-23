class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int temp = 0;
        int count = 1;
        int res = 1;
        
        if(nums.length == 0){
        
            return 0;
        
        }
      
        for(int i =0; i < nums.length-1;++i){        
            if(nums[i+1]==nums[i]){
                continue;
            }

            temp =  nums[i] + 1;

            
            if(temp == nums[i+1]){
                count++;
        
            }else{
                res = Math.max(count,res);
                count = 1;
            }
        }

        res = Math.max(count,res);
        return res;
        
        
    }
}

//[,,,,,,,,,,]

//[ -1, -1, 0 , 1]
//4;
//[3,4,5,6, 7, 8 ,9 ]
//7
