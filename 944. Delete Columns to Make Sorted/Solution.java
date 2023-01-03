// 944. Delete Columns to Make Sorted
// ==================================

class Solution {

    public int minDeletionSize(String[] strs) {

    int arrlen = strs.length;

    int wordlen = strs[0].length();

    int ans = 0;

        for(int i=0; i<wordlen; i++) {

            for(int j=1; j<arrlen; j++) {

                if(strs[j].charAt(i) < strs[j-1].charAt(i)) {

                ans++;
                break;
                }
            }
        }
    return ans;       

    }
}