import java.util.*;

public class ShortestPathBFS {

    static class Graph {

        int vertices;
        ArrayList<ArrayList<Integer>> graph;

        Graph(int vertices) {

            this.vertices = vertices;
            graph = new ArrayList<>();

            for (int i = 0; i < vertices; i++) {
                graph.add(new ArrayList<>());
            }
        }

        void addEdge(int source, int destination) {

            graph.get(source).add(destination);
            graph.get(destination).add(source);
        }

        void shortestPath(int start) {

            int[] distance = new int[vertices];

            Arrays.fill(distance, -1);

            Queue<Integer> queue = new LinkedList<>();

            distance[start] = 0;
            queue.add(start);

            while (!queue.isEmpty()) {

                int current = queue.poll();

                for (int neighbor : graph.get(current)) {

                    if (distance[neighbor] == -1) {

                        distance[neighbor] =
                                distance[current] + 1;

                        queue.add(neighbor);
                    }
                }
            }

            System.out.println("Shortest distances from " + start + ":");

            for (int i = 0; i < vertices; i++) {
                System.out.println(
                        start + " → " + i + " = " + distance[i]
                );
            }
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.shortestPath(0);
    }
}