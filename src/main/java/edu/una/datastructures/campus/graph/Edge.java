package edu.una.datastructures.campus.graph;

public class Edge {

    private Vertex destination;
    private int weight;
    private Edge next; // para lista de adyacencia manual

    public Edge(Vertex destination, int weight) {
        this.destination = destination;
        this.weight = weight;
        this.next = null;
    }

    public Vertex getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    public Edge getNext() {
        return next;
    }

    public void setNext(Edge next) {
        this.next = next;
    }
}
