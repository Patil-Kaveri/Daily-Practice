import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top Element: " + stack.peek());

        // Pop element
        System.out.println("Removed Element: " + stack.pop());

        // Display stack after pop
        System.out.println("Stack after Pop: " + stack);

        // Check if stack is empty
        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }
}