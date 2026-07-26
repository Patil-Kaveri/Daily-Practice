import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        // Add key-value pairs
        students.put(103, "Priya");
        students.put(101, "Kaveri");
        students.put(102, "Rahul");

        // Display TreeMap (sorted by keys)
        System.out.println("TreeMap: " + students);

        // Get value by key
        System.out.println("Student with ID 101: " + students.get(101));

        // Remove an entry
        students.remove(102);

        System.out.println("After Removing ID 102: " + students);

        // Traverse TreeMap
        for (Integer key : students.keySet()) {
            System.out.println(key + " -> " + students.get(key));
        }
    }
}