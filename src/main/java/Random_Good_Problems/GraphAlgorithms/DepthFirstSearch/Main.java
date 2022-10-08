package main.java.Random_Good_Problems.GraphAlgorithms.DepthFirstSearch;

import main.java.Random_Good_Problems.GraphAlgorithms.BreadthFirstSearch.BreadthFirstSearch;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");


        a.addNeighbour(b);
        a.addNeighbour(f);
        a.addNeighbour(g);

        b.addNeighbour(a);
        b.addNeighbour(c);
        b.addNeighbour(d);

        c.addNeighbour(b);

        d.addNeighbour(e);
        d.addNeighbour(b);

        e.addNeighbour(d);

        f.addNeighbour(a);

        g.addNeighbour(a);
        g.addNeighbour(h);

        h.addNeighbour(g);

        List<Vertex> vertexList = Arrays.asList(a, b, c, d, e, f, g, h);

        depthFirstSearch.traverse(vertexList);
    }
}
