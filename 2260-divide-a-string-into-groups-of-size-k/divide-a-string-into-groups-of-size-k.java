class Solution {
    public String[] divideString(String s, int k, char fill) {
          int n = s.length();
        
        // Total number of groups needed (ceiling of n/k)
        int groups = (n + k - 1) / k;

        // Total characters needed = groups * k
        int totalChars = groups * k;

        // Number of fill characters to add
        int fillsToAdd = totalChars - n;

        // Append fill characters at the end of the string
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < fillsToAdd; i++) {
            sb.append(fill);
        }

        // Now divide into groups of size k
        String[] result = new String[groups];
        for (int i = 0; i < groups; i++) {
            result[i] = sb.substring(i * k, (i + 1) * k);
        }

        return result;
        
    }
}