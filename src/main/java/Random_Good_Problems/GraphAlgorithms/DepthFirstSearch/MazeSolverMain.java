package main.java.Random_Good_Problems.GraphAlgorithms.DepthFirstSearch;

public class MazeSolverMain {

    public static void main(String[] args) {
        int[][] maze = {

                {1, 1, 1, 1, 1},
                {2, 0, 0, 1, 1},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0}
        };

        MazeSolver mazeSolver = new MazeSolver(maze, 1, 0);
        mazeSolver.findWay();
    }
}
