class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        StringBuilder sb = new StringBuilder();
        
        int bigLen = Math.max(word1Len, word2Len);

        for(int i =0 ; i < bigLen; i++){
            if(i < word1Len){
                sb.append(word1.charAt(i));
            }

            if(i < word2Len){
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}