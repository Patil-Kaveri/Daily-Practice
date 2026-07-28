import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        // Add elements
        deque.addFirst("Java");
        deque.addLast("Python");
        deque.addFirst("C++");
        deque.addLast("JavaScript");

        System.out.println("Deque: " + deque);

        // Remove elements
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        System.out.println("Deque after Removal: " + deque);

        // Peek elements
        System.out.println("First Element: " + deque.peekFirst());
        System.out.println("Last Element: " + deque.peekLast());
    }
}