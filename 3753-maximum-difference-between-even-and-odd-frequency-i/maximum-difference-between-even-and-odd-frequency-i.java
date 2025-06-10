class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int odd =Integer.MIN_VALUE, even = Integer.MAX_VALUE;

        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0) + 1);
        } 

        for(int value : hm.values()){
            if(value % 2 == 1){
                odd = Math.max(odd, value);
            }else{
                even = Math.min(even,value);
            }
        }


    return odd-even;
    }
}