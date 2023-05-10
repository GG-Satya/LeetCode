// 59. Spiral Matrix II
// ====================

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
	        char dir = 'r';
	        int i = 0, j = -1;
	        for(int k=1; k<=n*n; k++){
	            switch(dir){
	                case 'r':   matrix[i][++j] = k;
	                            if(j == n-1 || matrix[i][j+1] != 0)dir = 'd';
	                            break;

	                case 'd':   matrix[++i][j] = k;
	                            if(i == n-1 || matrix[i+1][j] != 0)dir = 'l';
	                            break;

	                case 'l':   matrix[i][--j] = k;
	                            if(j == 0 || matrix[i][j-1] != 0)dir = 'u';
	                            break;

	                case 'u':   matrix[--i][j] = k;
	                            if(i == 0 || matrix[i-1][j] != 0)dir = 'r';
	                            break;
	            }
	        }return matrix;
    }
}