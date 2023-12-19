// 242. Valid Anagram
// ==================

class Solution {
    public boolean isAnagram(String s, String t) {
        while(s.length() == t.length()){
            if(s.length() == 0 && t.length() == 0)return true;
            char c = s.charAt(0);
            s = s.replace(c+"","");
            t = t.replace(c+"","");
        }return false;
    }
}