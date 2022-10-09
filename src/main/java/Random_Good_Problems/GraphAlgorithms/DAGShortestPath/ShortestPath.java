package main.java.Random_Good_Problems.GraphAlgorithms.DAGShortestPath;

import java.util.List;
import java.util.Stack;

public class ShortestPath {


    TopologicalOrdering topologicalOrdering;

    ShortestPath(List<Vertex> graph) {
        TopologicalOrdering topologicalOrdering = new TopologicalOrdering(graph);
        graph.get(0).setMinDistance(0);
    }


    public void getShortestPath() {
        Stack<Vertex> topologicalOrder = topologicalOrdering.getTopologicalOrder();

        while (!topologicalOrder.isEmpty()) {
            Vertex u = topologicalOrder.pop();

            for (Edge e : u.getAdjacencyList()) {
                Vertex v = e.getTarget();

                if (u.getMinDistance() + e.getWeight() < v.getMinDistance()) {
                    v.setMinDistance(u.getMinDistance() + e.getWeight());
                    v.setPredecessor(u);
                }

            }
        }
    }

}

