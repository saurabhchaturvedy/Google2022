package main.java.Random_Good_Problems.GraphAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Vertex {


    String name;
    List<Vertex> adjacencyList;

    Vertex(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.adjacencyList.add(vertex);
    }

    public void showNeighbours() {
        for (Vertex v : this.adjacencyList) {
            System.out.println(v);
        }
    }

    public String toString() {
        return name;
    }
}
