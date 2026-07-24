import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Display elements
        System.out.println("ArrayList: " + fruits);

        // Access an element
        System.out.println("First Fruit: " + fruits.get(0));

        // Remove an element
        fruits.remove("Banana");

        // Display updated list
        System.out.println("After Removing Banana: " + fruits);

        // Size of ArrayList
        System.out.println("Size: " + fruits.size());
    }
}