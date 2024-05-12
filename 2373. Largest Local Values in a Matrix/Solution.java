//2373. Largest Local Values in a Matrix

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m-2][n-2];
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                ans[i][j] = getLargest(grid,i,j);
            }
        }
        return ans;
    }
    private int getLargest(int[][] grid, int a, int b){
        int max = Integer.MIN_VALUE;
        for(int i=a; i<=a+2; i++){
            for(int j=b; j<=b+2; j++){
                max = Math.max(max,grid[i][j]);
            }
        }return max;
    }
}