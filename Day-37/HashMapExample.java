import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(101, "Kaveri");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        // Display HashMap
        System.out.println("Student List: " + students);

        // Access value using key
        System.out.println("Student with ID 102: " + students.get(102));

        // Remove an entry
        students.remove(103);

        System.out.println("After Removing ID 103: " + students);

        // Display all entries
        for (Integer key : students.keySet()) {
            System.out.println(key + " -> " + students.get(key));
        }
    }
}