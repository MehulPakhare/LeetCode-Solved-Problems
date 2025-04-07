class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i: nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        
        int maxFreq= 0;
        for(int frequency: hm.values()){
            maxFreq = Math.max(maxFreq , frequency);
        }

        int frequencyOfMaxFrequency = 0;
        for (int frequency : hm.values()) {
            if (frequency == maxFreq) {
                frequencyOfMaxFrequency++;
            }
        }

        return frequencyOfMaxFrequency * maxFreq;


    }
}