// 118. Pascal's Triangle
// ======================

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>(numRows);
	    ans.add(Arrays.asList(1)); // add [1,1] manually, as it not require any sum
	    if(numRows == 1) return ans;

	    for(int i = 0; i < numRows-1; i++){ 
	        List<Integer> row = new ArrayList<>();

	        row.add(1);  // add 1 at beginning

	        var prev = ans.get(i);
            // add rest elements in loop by fetching previous list 
	        for(int j = 0; j < i; j++) 
                row.add(prev.get(j)+prev.get(j+1));

	        row.add(1);  // add 1 at ending
	        ans.add(row);
	    }
	    return ans;
    }
}