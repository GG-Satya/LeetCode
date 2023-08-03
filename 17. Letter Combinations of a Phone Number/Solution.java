// 17. Letter Combinations of a Phone Number
// =========================================

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty())return ans;
        String[] mapping = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ans.add("");
        for(int i=0; i<digits.length(); i++){
            int x = digits.charAt(i)-'0';
            while(ans.peek().length() == i){
                String t = ans.poll();
                for(char c : mapping[x].toCharArray()) ans.add(t+c);
            }
        }
        return ans;
    }
}