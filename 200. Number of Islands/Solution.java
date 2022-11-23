
class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                //if found '1' then increement the no of island 
                if(grid[i][j]=='1'){
                    ans++;
                    makeZero(grid,i,j); // and make this island disappear in next iteration by converting all adjacent element into '0'
                }
            }
        }
        return ans;
    }
    private void makeZero(char[][] grid, int i, int j){

        //base condition to stop the recurrsion
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0') return; 

        grid[i][j]= '0'; // make the land '0'

        // and make its left, right, up, down element also '0' recurrsively
        makeZero(grid,i+1,j);
        makeZero(grid,i-1,j);
        makeZero(grid,i,j+1);
        makeZero(grid,i,j-1);
    }
}