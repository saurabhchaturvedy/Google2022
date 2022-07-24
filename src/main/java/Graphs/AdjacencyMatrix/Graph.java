package main.java.Graphs.AdjacencyMatrix;

public class Graph {

    private int V;
    private int E;
    private int[][] adjMatrix;

    Graph(int nodes) {
        this.V = nodes;
        this.E = 0;

        this.adjMatrix = new int[nodes][nodes];
    }

    private void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " Vertices, " + E + " Edges " + " \n");
        for (int v = 0; v < V; v++) {
            sb.append(v + " : ");
            for (int w : adjMatrix[v]) {
                sb.append(w + " ");
            }

            sb.append("\n");
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);

        System.out.println(graph);
    }
}
