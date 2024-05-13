class Solution {
    public int matrixScore(int[][] grid) {
        
     int rows = grid.length;
        int cols = grid[0].length;
        
        // Step 1: Flip rows if necessary to maximize the leftmost column
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < cols; j++) {
                    grid[i][j] = 1 - grid[i][j]; // Flip the row
                }
            }
        }
        
        // Step 2: Flip columns if necessary to maximize each subsequent column
        for (int j = 1; j < cols; j++) {
            int countOnes = 0;
            for (int i = 0; i < rows; i++) {
                countOnes += grid[i][j]; // Count number of ones in the column
            }
            if (countOnes < rows / 2) { // If the number of ones is less than half, flip the column
                for (int i = 0; i < rows; i++) {
                    grid[i][j] = 1 - grid[i][j]; // Flip the column
                }
            }
        }
        
        // Step 3: Calculate the score
        int score = 0;
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += grid[i][j]; // Calculate sum of column
            }
            score += Math.max(colSum, rows - colSum) * (1 << (cols - 1 - j)); // Calculate contribution to score
        }
        
        return score;
    }
}