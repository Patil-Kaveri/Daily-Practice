import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraphTraversal {

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

        void BFS(int start) {

            boolean[] visited = new boolean[vertices];

            Queue<Integer> queue = new LinkedList<>();

            visited[start] = true;

            queue.add(start);

            while (!queue.isEmpty()) {

                int current = queue.poll();

                System.out.print(current + " ");

                for (int neighbor : adjacencyList.get(current)) {

                    if (!visited[neighbor]) {

                        visited[neighbor] = true;

                        queue.add(neighbor);
                    }
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

        System.out.println("BFS Traversal:");

        graph.BFS(0);
    }
}