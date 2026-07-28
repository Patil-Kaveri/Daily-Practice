import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        System.out.println("Priority Queue: " + pq);

        // View the head element
        System.out.println("Head Element: " + pq.peek());

        // Remove the head element
        System.out.println("Removed Element: " + pq.poll());

        // Display updated queue
        System.out.println("After Poll: " + pq);

        // Display all elements
        System.out.println("Elements in Priority Queue:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}