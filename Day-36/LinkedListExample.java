import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        // Add elements
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");

        // Display elements
        System.out.println("LinkedList: " + cities);

        // Add first and last
        cities.addFirst("Bangalore");
        cities.addLast("Hyderabad");

        System.out.println("Updated LinkedList: " + cities);

        // Remove first element
        cities.removeFirst();

        System.out.println("After Removing First: " + cities);
    }
}