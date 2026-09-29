import java.util.*;

public class DijkstraAlgorithm {

    static class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Node {
        int vertex;
        int distance;

        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }

    static void dijkstra(
            ArrayList<ArrayList<Edge>> graph,
            int source) {

        int vertices = graph.size();

        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);

        PriorityQueue<Node> pq =
                new PriorityQueue<>(
                        (a, b) -> a.distance - b.distance
                );

        distance[source] = 0;

        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {

            Node current = pq.poll();

            int currentVertex = current.vertex;
            int currentDistance = current.distance;

            // Ignore outdated entries
            if (currentDistance > distance[currentVertex]) {
                continue;
            }

            for (Edge edge : graph.get(currentVertex)) {

                int newDistance =
                        currentDistance + edge.weight;

                if (newDistance < distance[edge.destination]) {

                    distance[edge.destination] = newDistance;

                    pq.add(
                            new Node(
                                    edge.destination,
                                    newDistance
                            )
                    );
                }
            }
        }

        System.out.println(
                "Shortest distances from " + source + ":"
        );

        for (int i = 0; i < vertices; i++) {

            System.out.println(
                    source + " → " + i +
                    " = " + distance[i]
            );
        }
    }

    static void addEdge(
            ArrayList<ArrayList<Edge>> graph,
            int source,
            int destination,
            int weight) {

        graph.get(source).add(
                new Edge(destination, weight)
        );

        graph.get(destination).add(
                new Edge(source, weight)
        );
    }

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Edge>> graph =
                new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1, 4);
        addEdge(graph, 0, 2, 2);
        addEdge(graph, 1, 3, 1);
        addEdge(graph, 2, 3, 3);

        dijkstra(graph, 0);
    }
}