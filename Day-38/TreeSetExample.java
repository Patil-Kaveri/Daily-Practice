import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(20); // Duplicate

        // Display TreeSet
        System.out.println("TreeSet: " + numbers);

        // Check element
        System.out.println("Contains 40? " + numbers.contains(40));

        // Remove an element
        numbers.remove(20);

        System.out.println("After Removing 20: " + numbers);

        // Traverse TreeSet
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}