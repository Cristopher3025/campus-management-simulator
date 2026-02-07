package edu.una.datastructures.campus.graph;

public class AdjacencyListGraph {

    private Vertex[] vertices;
    private Edge[] adjacencyList;
    private int size;

    /**
     * Creates a graph with a fixed maximum number of vertices.
     * We use arrays instead of ArrayList to respect project rules.
     */
    public AdjacencyListGraph(int maxVertices) {
        vertices = new Vertex[maxVertices];
        adjacencyList = new Edge[maxVertices];
        size = 0;
    }

    /**
     * Adds a vertex to the graph.
     */
    public void addVertex(Vertex vertex) {
        vertices[size] = vertex;
        adjacencyList[size] = null;
        size++;
    }

    /**
     * Adds a directed edge from origin to destination with a given weight.
     * For an undirected graph, this method must be called twice.
     */
    public void addEdge(Vertex origin, Vertex destination, int weight) {
        int originIndex = getVertexIndex(origin);
        if (originIndex == -1) {
            return;
        }

        Edge newEdge = new Edge(destination, weight);
        newEdge.setNext(adjacencyList[originIndex]);
        adjacencyList[originIndex] = newEdge;
    }

    /**
     * Returns the index of a vertex inside the vertices array.
     */
    private int getVertexIndex(Vertex vertex) {
        for (int i = 0; i < size; i++) {
            if (vertices[i].equals(vertex)) {
                return i;
            }
        }
        return -1;
    }

    // =========================
    // DEPTH-FIRST SEARCH (DFS)
    // =========================

    /**
     * Performs a Depth-First Search traversal starting from the given vertex.
     */
    public void dfs(Vertex start) {
        boolean[] visited = new boolean[size];
        int startIndex = getVertexIndex(start);

        if (startIndex == -1) {
            return;
        }

        dfsRecursive(startIndex, visited);
    }

    /**
     * Recursive DFS implementation.
     */
    private void dfsRecursive(int vertexIndex, boolean[] visited) {

        // Mark current vertex as visited
        visited[vertexIndex] = true;

        // Process the vertex (print it)
        System.out.println(vertices[vertexIndex]);

        // Traverse adjacency list
        Edge currentEdge = adjacencyList[vertexIndex];

        while (currentEdge != null) {
            int neighborIndex = getVertexIndex(currentEdge.getDestination());

            if (neighborIndex != -1 && !visited[neighborIndex]) {
                dfsRecursive(neighborIndex, visited);
            }

            currentEdge = currentEdge.getNext();
        }
    }
}
