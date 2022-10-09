package main.java.Random_Good_Problems.GraphAlgorithms.CycleDetection;

import java.util.List;

public class CycleDetector {


    public void detectCycle(List<Vertex> graph) {

        for (Vertex v : graph) {
            if (!v.isVisited()) {
                dfs(v);
            }
        }
    }

    public void dfs(Vertex vertex) {
        vertex.setBeingVisited(true);

        for (Vertex v : vertex.getNeighbours()) {
            if (v.isBeingVisited()) {
                System.out.println("Cycle  exists in the graph...");
            } else {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    dfs(v);
                }
            }
        }
    }
}
