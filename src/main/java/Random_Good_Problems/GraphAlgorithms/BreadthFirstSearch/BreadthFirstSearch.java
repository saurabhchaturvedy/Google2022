package main.java.Random_Good_Problems.GraphAlgorithms.BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {


    public void traverse(Vertex vertex) {
        Queue<Vertex> queue = new LinkedList<>();

        vertex.setVisited(true);
        queue.add(vertex);

        while (!queue.isEmpty()) {
            Vertex visitedVertex = queue.poll();
            System.out.print(visitedVertex + " ");

            for (Vertex v : visitedVertex.getNeighbours()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
