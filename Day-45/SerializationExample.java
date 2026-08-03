import java.io.*;

// Serializable class
class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationExample {

    public static void main(String[] args) {

        Student s = new Student(101, "Kaveri");

        try {
            // Serialize object
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(s);

            out.close();
            fileOut.close();

            System.out.println("Object Serialized Successfully.");

            // Deserialize object
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student student = (Student) in.readObject();

            in.close();
            fileIn.close();

            System.out.println("Deserialized Student:");
            System.out.println("ID: " + student.id);
            System.out.println("Name: " + student.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}