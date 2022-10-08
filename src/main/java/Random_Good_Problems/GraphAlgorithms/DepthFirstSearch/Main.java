package main.java.Random_Good_Problems.GraphAlgorithms.DepthFirstSearch;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");


        a.addNeighbour(b);
        a.addNeighbour(c);
        c.addNeighbour(d);
        d.addNeighbour(e);

        List<Vertex> vertexList = Arrays.asList(a, b, c, d, e);

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

        depthFirstSearch.traverse(vertexList);
    }
}
