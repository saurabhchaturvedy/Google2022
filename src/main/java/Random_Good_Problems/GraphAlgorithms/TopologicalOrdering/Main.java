package main.java.Random_Good_Problems.GraphAlgorithms.TopologicalOrdering;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        TopologicalOrdering topologicalOrdering = new TopologicalOrdering();
        List<Vertex> graph = new ArrayList<>();

        graph.add(new Vertex("0"));
        graph.add(new Vertex("1"));
        graph.add(new Vertex("2"));
        graph.add(new Vertex("3"));
        graph.add(new Vertex("4"));
        graph.add(new Vertex("5"));


        graph.get(2).addNeighbour(graph.get(3));
        graph.get(5).addNeighbour(graph.get(0));
        graph.get(5).addNeighbour(graph.get(2));
        graph.get(4).addNeighbour(graph.get(0));
        graph.get(4).addNeighbour(graph.get(1));
        graph.get(3).addNeighbour(graph.get(1));


        for (int i = 0; i < graph.size(); i++) {
            if (!graph.get(i).isVisited()) {
                topologicalOrdering.dfs(graph.get(i));
            }
        }


        Stack<Vertex> stack = topologicalOrdering.getTopologicalOrder();

        for (int i = 0; i < graph.size(); i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
