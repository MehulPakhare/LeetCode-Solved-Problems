class Solution {
    public String makeGood(String s) {
        StringBuilder result = new StringBuilder(s);

        while(result.length() > 1){
            boolean find = false;

            for(int i =0; i < result.length()-1; ++i){
                char currChar = result.charAt(i);
                char nextChar = result.charAt(i+1);

                if(Math.abs(currChar - nextChar) == 32){
                    result.deleteCharAt(i);
                    result.deleteCharAt(i);
                    find = true;
                    break;
                }
            }

            if(!find){
                break;
            }
        } 
        return result.toString();
        
    }
}