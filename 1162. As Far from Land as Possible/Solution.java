// 1162. As Far from Land as Possible
// ==================================

class Solution {

    public int maxDistance(int[][] grid) {

        int n = grid.length, m = grid[0].length, res = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1) continue;

                grid[i][j] = 201; //201 here cuz as the despription, the size won't exceed 100.

                if (i > 0) grid[i][j] = Math.min(grid[i][j], grid[i-1][j] + 1);

                if (j > 0) grid[i][j] = Math.min(grid[i][j], grid[i][j-1] + 1);
            }
        }
        
        for (int i = n-1; i > -1; i--) {

            for (int j = m-1; j > -1; j--) {

                if (grid[i][j] == 1) continue;

                if (i < n-1) grid[i][j] = Math.min(grid[i][j], grid[i+1][j] + 1);

                if (j < m-1) grid[i][j] = Math.min(grid[i][j], grid[i][j+1] + 1);

                res = Math.max(res, grid[i][j]); //update the maximum
            }
        }
        
        return res == 201 ? -1 : res - 1;
    }
}