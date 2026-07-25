import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate

        // Display HashSet
        System.out.println("HashSet: " + fruits);

        // Check element
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Remove element
        fruits.remove("Banana");

        System.out.println("After Removing Banana: " + fruits);

        // Display all elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}