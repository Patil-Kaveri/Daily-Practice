import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Rahul"));
        students.add(new Student(101, "Kaveri"));
        students.add(new Student(102, "Priya"));

        Collections.sort(students);

        System.out.println("Students sorted by ID:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}