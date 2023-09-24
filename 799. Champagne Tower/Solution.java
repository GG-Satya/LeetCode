class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {

    // Initialize a 2D array to represent the champagne in each glass
    // Initialize all glasses with 0 champagne
    double[][] tower = new double[query_row + 1][query_row + 1];
    
    // Pour the initial amount of champagne into the top glass
    tower[0][0] = (double) poured;
    
    // Simulate the pouring and distribution of champagne
    for (int i = 0; i < query_row; i++) {
        for (int j = 0; j <= i; j++) {
            double excess = (tower[i][j] - 1.0) / 2.0;
            if (excess > 0) {
                tower[i + 1][j] += excess;
                tower[i + 1][j + 1] += excess;
            }
        }
    }
    
    // Ensure the value is within the valid range [0, 1]
    return Math.min(1.0, tower[query_row][query_glass]);
   }
}