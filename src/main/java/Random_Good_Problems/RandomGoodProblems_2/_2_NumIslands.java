package main.java.Random_Good_Problems.RandomGoodProblems_2;

class _2_NumIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    infect(grid, i, j, rows, cols);
                    islands++;
                }
            }
        }

        return islands;
    }

    // Using DFS Method to find the region
    private void infect(char[][] grid, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != '1') {
            return;
        }
        // Mark the explored island cells with 'x'.
        grid[i][j] = 'x';
        // Use the directions array to make code more concise
        int[][] dirs = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        for (int[] dir : dirs) {
            infect(grid, i + dir[0], j + dir[1], rows, cols);
        }
    }
}