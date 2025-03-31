class Solution {
    public boolean isValid(String s) {
        HashMap<Character , Character> hm = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        hm.put('(' , ')');
        hm.put('{', '}');
        hm.put('[', ']');

        for(char c: s.toCharArray()){
            if(hm.containsKey(c)){
                stack.push(c);
            }else{
                if(stack.empty()){
                  return false;
                }

                char preOpen = stack.pop();
                if(hm.get(preOpen) != c){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}