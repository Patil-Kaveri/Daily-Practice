import java.util.ArrayList;

public class GraphRepresentation {

    static class Graph {

        int vertices;
        ArrayList<ArrayList<Integer>> adjacencyList;

        Graph(int vertices) {

            this.vertices = vertices;

            adjacencyList = new ArrayList<>();

            for (int i = 0; i < vertices; i++) {
                adjacencyList.add(new ArrayList<>());
            }
        }

        void addEdge(int source, int destination) {

            adjacencyList.get(source).add(destination);

            // For an undirected graph
            adjacencyList.get(destination).add(source);
        }

        void printGraph() {

            for (int i = 0; i < vertices; i++) {

                System.out.print(i + " → ");

                for (int neighbor : adjacencyList.get(i)) {
                    System.out.print(neighbor + " ");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        System.out.println("Graph Representation:");

        graph.printGraph();
    }
}