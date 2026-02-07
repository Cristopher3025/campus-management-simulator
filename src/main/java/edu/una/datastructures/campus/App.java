package edu.una.datastructures.campus;

import edu.una.datastructures.campus.graph.AdjacencyListGraph;
import edu.una.datastructures.campus.graph.Vertex;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        // ===== INTERFAZ GRÁFICA BÁSICA =====
        Label title = new Label("Campus Management Simulator");

        Button graphButton = new Button("Test Graph DFS");
        Button exitButton = new Button("Exit");

        // Acción del botón de prueba del grafo
        graphButton.setOnAction(e -> testGraphDFS());

        exitButton.setOnAction(e -> stage.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(
                title,
                graphButton,
                exitButton
        );

        Scene scene = new Scene(layout, 400, 200);
        stage.setTitle("Campus Simulator");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Manual test to verify that the graph DFS traversal
     * works correctly before integrating it into the full simulation.
     *
     * This method creates a simple graph and performs
     * a depth-first search starting from vertex A.
     */
    private void testGraphDFS() {

        System.out.println("=== TESTING GRAPH DFS ===");

        AdjacencyListGraph graph = new AdjacencyListGraph(5);

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);

        // Undirected graph (add edges both ways)
        graph.addEdge(a, b, 1);
        graph.addEdge(b, a, 1);

        graph.addEdge(b, c, 1);
        graph.addEdge(c, b, 1);

        graph.addEdge(c, d, 1);
        graph.addEdge(d, c, 1);

        graph.addEdge(a, d, 1);
        graph.addEdge(d, a, 1);

        System.out.println("DFS traversal starting from A:");
        graph.dfs(a);

        System.out.println("=== END OF GRAPH DFS TEST ===");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
