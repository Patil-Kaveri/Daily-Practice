class Student {

    // Private data members
    private int id;
    private String name;

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {

        Student s = new Student();

        s.setId(101);
        s.setName("Kaveri");

        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
    }
}