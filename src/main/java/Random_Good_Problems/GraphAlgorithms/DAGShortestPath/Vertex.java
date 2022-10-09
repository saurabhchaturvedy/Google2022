package main.java.Random_Good_Problems.GraphAlgorithms.DAGShortestPath;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    String name;
    boolean visited;
    int minDistance;
    Vertex predecessor;
    List<Edge> adjacencyList;


    Vertex(String name) {
        this.name = name;
        this.minDistance = Integer.MAX_VALUE;
        this.adjacencyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public List<Edge> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Edge> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }
}
