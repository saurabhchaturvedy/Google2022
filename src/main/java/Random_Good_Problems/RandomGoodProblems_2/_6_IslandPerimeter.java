package main.java.Random_Good_Problems.RandomGoodProblems_2;

class _6_IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }

        int count = 0;
        int neighbours = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // count islands
                if (grid[i][j] == 1) {
                    count++;
                    // count down neighbours
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        neighbours++;
                    }
                    // count right neighbours
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        neighbours++;
                    }
                }
            }
        }

        return count * 4 - neighbours * 2;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };


        System.out.println(islandPerimeter(arr));
    }
}