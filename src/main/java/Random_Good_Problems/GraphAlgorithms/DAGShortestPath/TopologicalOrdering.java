package main.java.Random_Good_Problems.GraphAlgorithms.DAGShortestPath;

import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {

    Stack<Vertex> stack;

    TopologicalOrdering(List<Vertex> graph) {
        this.stack = new Stack<>();

        for (Vertex v : graph) {
            if (!v.isVisited()) {
                dfs(v);
            }
        }
    }


    public void dfs(Vertex vertex) {
        vertex.setVisited(true);

        for (Edge e : vertex.getAdjacencyList()) {

            if (!e.getTarget().isVisited()) {
                dfs(e.getTarget());
            }
        }

        stack.push(vertex);
    }

    public Stack<Vertex> getTopologicalOrder() {
        return stack;
    }

}
