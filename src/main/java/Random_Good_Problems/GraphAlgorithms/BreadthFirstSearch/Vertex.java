package main.java.Random_Good_Problems.GraphAlgorithms.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    String name;
    boolean visited;
    List<Vertex> adjacencyList;

    Vertex(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.adjacencyList.add(vertex);
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String toString() {
        return name;
    }
}
