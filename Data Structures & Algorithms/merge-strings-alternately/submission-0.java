class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        if(word1.length() == word2.length()){
            for(int i=0;i<word1.length();i++){
                char temp1 = word1.charAt(i);
                char temp2 = word2.charAt(i);
                result = result + temp1 + temp2;
            
            }
        }
        else{
                int n = Math.min(word1.length(), word2.length());
                for(int i=0;i<n;i++){
                    char temp1 = word1.charAt(i);
                    char temp2 = word2.charAt(i);
                    result = result + temp1 + temp2;
                }
                if (word1.length() > word2.length()) {
                    for (int i = n; i < word1.length(); i++) {
                        result = result + word1.charAt(i);
                    }
                } 
                else {
                    for (int i = n; i < word2.length(); i++) {
                        result = result + word2.charAt(i);
                    }
                }
            }

        return result;
    }
}