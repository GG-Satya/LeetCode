// 1768. Merge Strings Alternately
// ===============================

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String rem ="";
        int len =0;
        if(word1.length() < word2.length()){
            len = word1.length();
            rem = word2.substring(len);
        }else{
            len = word2.length();
            rem = word1.substring(len);
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0; i< len; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        return sb.append(rem).toString();
    }
}