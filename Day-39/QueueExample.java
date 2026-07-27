import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("Java");
        queue.add("Python");
        queue.add("C++");

        System.out.println("Queue: " + queue);

        // View front element
        System.out.println("Front Element: " + queue.peek());

        // Remove front element
        System.out.println("Removed Element: " + queue.poll());

        // Display queue after removal
        System.out.println("Queue after Poll: " + queue);

        // Check if queue is empty
        System.out.println("Is Queue Empty? " + queue.isEmpty());
    }
}