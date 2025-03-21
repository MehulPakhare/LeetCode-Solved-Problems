class Solution {
     static HashMap<String, Integer> values = new HashMap<>();

         static final String[] romanKeys = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        static{
            values.put("I" , 1);
            values.put("V" , 5);
            values.put("X" , 10);
            values.put("L" , 50);
            values.put("C" , 100);
            values.put("D" , 500);
            values.put("M" , 1000);
            values.put("IV" , 4);
            values.put("IX" , 9);
            values.put("XL" , 40);
            values.put("XC" , 90);
            values.put("CD" , 400);
            values.put("CM" , 900);
        } 

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        for(String id: romanKeys){
            while(num >= values.get(id)){
                sb.append(id);
                num -= values.get(id);
            }
        }
        return sb.toString();
    
    }
}