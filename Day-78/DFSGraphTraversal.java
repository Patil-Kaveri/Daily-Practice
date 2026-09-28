import java.util.ArrayList;

public class DFSGraphTraversal {

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
            adjacencyList.get(destination).add(source);
        }

        void DFS(int current, boolean[] visited) {

            // Mark current node as visited
            visited[current] = true;

            System.out.print(current + " ");

            // Visit all unvisited neighbors
            for (int neighbor : adjacencyList.get(current)) {

                if (!visited[neighbor]) {
                    DFS(neighbor, visited);
                }
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

        boolean[] visited = new boolean[5];

        System.out.println("DFS Traversal:");

        graph.DFS(0, visited);
    }
}