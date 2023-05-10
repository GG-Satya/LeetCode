// 1572. Matrix Diagonal Sum
// =========================

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0, j=mat.length-1; i<mat.length; i++,j--){
            sum += mat[i][i];
            if(i != j) sum += mat[i][j];
        }
        return sum;
    }
}