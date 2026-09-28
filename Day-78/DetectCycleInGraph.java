import java.util.ArrayList;

public class DetectCycleInGraph {

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

        boolean hasCycleUtil(
                int current,
                int parent,
                boolean[] visited) {

            visited[current] = true;

            for (int neighbor : adjacencyList.get(current)) {

                // Visit unvisited neighbor
                if (!visited[neighbor]) {

                    if (hasCycleUtil(
                            neighbor,
                            current,
                            visited)) {

                        return true;
                    }
                }

                // Already visited and not the parent
                else if (neighbor != parent) {

                    return true;
                }
            }

            return false;
        }

        boolean hasCycle() {

            boolean[] visited = new boolean[vertices];

            // Handle disconnected graph
            for (int i = 0; i < vertices; i++) {

                if (!visited[i]) {

                    if (hasCycleUtil(i, -1, visited)) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(3);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);

        if (graph.hasCycle()) {
            System.out.println("Cycle detected in the graph.");
        } else {
            System.out.println("No cycle detected.");
        }
    }
}