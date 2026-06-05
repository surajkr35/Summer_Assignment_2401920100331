class Solution {
    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) return "";

        int n = str.length;

        int minLen = Integer.MAX_VALUE;
        for (String s : str) {
            minLen = Math.min(minLen, s.length());
        }
        int k = 0;
        while (k < minLen) {
            char c = str[0].charAt(k); 

            for (int i = 1; i < n; i++) {
                if (str[i].charAt(k) != c) {
                    return str[0].substring(0, k);
                }
            }
            k++;
        }

        return str[0].substring(0, k);
    }
}

