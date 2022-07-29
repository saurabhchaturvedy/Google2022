package main.java.Graphs.AdjacencyList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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


    private void bfs(int s) {
        boolean[] visited = new boolean[V];

        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.offer(s);

        while (!queue.isEmpty()) {
            Integer u = queue.poll();
            System.out.print(u + " ");

            for (int w : adj[u]) {
                if (!visited[w]) {
                    visited[w] = true;
                    queue.offer(w);
                }
            }
        }
    }

    private void dfs(int s) {
        boolean[] visited = new boolean[V];

        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            Integer u = stack.pop();


            if (!visited[u]) {
                visited[u] = true;

                System.out.print(u + " ");

                for (int w : adj[u]) {
                    stack.push(w);
                }
            }
        }
    }


    private void recursiveDFS() {
        boolean[] visited = new boolean[V];
        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                recursiveDFS(v, visited);
            }
        }
    }

    private void recursiveDFS(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v+" ");
        for (int w : adj[v]) {
            if (!visited[w]) {
                recursiveDFS(w, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);

        System.out.println(graph);

        graph.bfs(0);
        System.out.println();
        graph.dfs(0);
        System.out.println("Recursive DFS :");
        graph.recursiveDFS();
    }
}
