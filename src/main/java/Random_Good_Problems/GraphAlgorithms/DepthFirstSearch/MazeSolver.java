package main.java.Random_Good_Problems.GraphAlgorithms.DepthFirstSearch;

public class MazeSolver {

    int[][] maze;

    boolean[][] visited;
    int startRow;
    int startCol;

    MazeSolver(int[][] maze, int startRow, int startCol) {
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length];
        this.startRow = startRow;
        this.startCol = startCol;
    }

    public void findWay() {
        if (dfs(startRow, startCol)) {
            System.out.println("There is a way out ...!!");
        } else {
            System.out.println("No way out ... we're trapped !!");
        }
    }


    public boolean isFeasible(int row, int col) {
        if (row < 0 || row > maze.length - 1) return false;

        if (col < 0 || col > maze.length - 1) return false;

        if (visited[row][col]) return false;

        if (maze[row][col] == 1) return false;

        return true;

    }

    private boolean dfs(int row, int col) {

        if (row == maze.length - 1 && col == maze.length - 1) return true;

        if (isFeasible(row, col)) {
            visited[row][col] = true;

            if (dfs(row - 1, col)) return true;  // UP

            if (dfs(row + 1, col)) return true;  // DOWN

            if (dfs(row, col - 1)) return true;   // LEFT

            if (dfs(row, col + 1)) return true;  // RIGHT

            return false;
        }

        return false;
    }
}
