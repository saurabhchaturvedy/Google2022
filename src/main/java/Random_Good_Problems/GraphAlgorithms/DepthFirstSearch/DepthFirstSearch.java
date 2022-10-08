package main.java.Random_Good_Problems.GraphAlgorithms.DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {


    public void traverse(List<Vertex> vertexList) {
        // it may happen that we have independent clusters of graphs
        for (Vertex v : vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfs(v);
            }
        }
    }

    private void dfs(Vertex vertex) {

        Stack<Vertex> stack = new Stack<>();
        stack.push(vertex);
        vertex.setVisited(true);

        while (!stack.isEmpty()) {
            Vertex visitedVertex = stack.pop();
            System.out.print(visitedVertex + " ");

            for (Vertex v : visitedVertex.getNeighbours()) {
                if (!vertex.isVisited()) {
                    vertex.setVisited(true);
                    stack.push(v);
                }
            }
        }
    }
}
