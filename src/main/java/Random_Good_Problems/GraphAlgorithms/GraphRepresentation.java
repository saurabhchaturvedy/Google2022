package main.java.Random_Good_Problems.GraphAlgorithms;

public class GraphRepresentation {


    private static int[][] adjacencyMatrix = {
            {0, 2, 4, 0},
            {0, 0, 0, 3},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };


    public static void main(String[] args) {


        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[0].length; j++) {
                if (adjacencyMatrix[i][j] != 0) {
                    System.out.println("Edge with Weight : " + adjacencyMatrix[i][j]);
                }
            }
        }

        System.out.println(adjacencyMatrix[0][2]);

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");

        a.addNeighbour(b);
        a.addNeighbour(c);
        b.addNeighbour(d);

        a.showNeighbours();
    }
}
