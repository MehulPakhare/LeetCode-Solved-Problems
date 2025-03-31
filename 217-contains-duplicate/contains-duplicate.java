class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        boolean result =false;

        for(int i : nums){
            if(hs.contains(i)){
                result =true;
            }else if(!hs.contains(i)){
                hs.add(i);
            }
        }

        return result;
        
    }
}