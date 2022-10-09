package main.java.Random_Good_Problems.GraphAlgorithms.DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    String name;
    boolean visited;
    List<Vertex> neighbours;

    Vertex(String name) {
        this.name = name;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.neighbours.add(vertex);
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
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
