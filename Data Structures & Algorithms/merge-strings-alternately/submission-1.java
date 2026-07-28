class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int a = 0;
        int b = 0;
        String ans = "";
        for (int i = 0; i < Math.max(word1.length(), word2.length());i++) {
            if (a < l1) {
                ans += "" + word1.charAt(a);
                a += 1;
            }
            if (b < l2) {
                ans += "" + word2.charAt(b);
                b += 1;
            }
        }
        return ans;
    }
}