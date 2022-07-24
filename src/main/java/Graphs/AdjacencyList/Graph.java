package main.java.Graphs.AdjacencyList;

import java.util.LinkedList;
import java.util.List;

public class Graph {

    private int V;
    private int E;
    private List<Integer>[] adj;

    Graph(int nodes) {
        this.V = nodes;
        this.E = 0;

        this.adj = new LinkedList[nodes];

        for (int i = 0; i < nodes; i++) {
            this.adj[i] = new LinkedList<>();
        }
    }

    private void addEdge(int u, int v) {
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " Vertices, " + E + " Edges " + " \n");

        for (int v = 0; v < V; v++) {
            sb.append(v + " : ");

            for (int w : adj[v]) {
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
