package main.java.Random_Good_Problems.GraphAlgorithms.TopologicalOrdering;

import java.util.Stack;

public class TopologicalOrdering {


    Stack<Vertex> stack;

    TopologicalOrdering() {
        this.stack = new Stack<>();
    }

    public void dfs(Vertex vertex) {
        vertex.setVisited(true);

        for (Vertex v : vertex.getNeighbours()) {
            if (!v.isVisited()) {
                dfs(v);
            }


        }

        stack.push(vertex);
    }

    public Stack<Vertex> getTopologicalOrder() {
        return stack;
    }
}
