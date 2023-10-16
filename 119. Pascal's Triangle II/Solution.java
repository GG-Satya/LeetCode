// 119. Pascal's Triangle II
// =========================

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
	    ans.add(Arrays.asList(1)); // add [1,1] manually, as it not require any sum
	    if(rowIndex == 0) return ans.get(0);

	    for(int i = 0; i < rowIndex; i++){ 
	        List<Integer> row = new ArrayList<>();

	        row.add(1);  // add 1 at beginning

	        var prev = ans.get(i);
            // add rest elements in loop by fetching previous list 
	        for(int j = 0; j < i; j++) 
                row.add(prev.get(j)+prev.get(j+1));

	        row.add(1);  // add 1 at ending
	        ans.add(row);
	    }
	    return ans.get(rowIndex);
    }
}