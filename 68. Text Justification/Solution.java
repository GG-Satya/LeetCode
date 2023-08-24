// 68. Text Justification
// ======================

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        if(words.length == 0 || words == null){return res;}
        int index = 0;
        while(index < words.length){
            int last = index+1;
            int count = words[index].length();
            while(last < words.length){
                if(words[last].length() + count + 1 > maxWidth) break;
                count += words[last].length()+1;
                last++;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(words[index]);
            int diff = last - index -1;
            if(last == words.length || diff ==0){
                for(int i = index+1; i< last; i++){
                    sb.append(" ");
                    sb.append(words[i]);
                }
                for(int i=sb.length(); i<maxWidth; i++){
                    sb.append(" ");
                }         
            }
            else{
                int space = (maxWidth - count) / diff; 
                int r = (maxWidth - count) % diff; 
                for(int i = index + 1; i < last; i++){
                    for(int k = space; k > 0; k--){sb.append(" ");}
                    if(r > 0){
                        sb.append(" ");
                        r--;
                    }
                    sb.append(" ");
                    sb.append(words[i]);
                }
            }
            res.add(sb.toString());
            index = last;
        }
        return res;
    }
}