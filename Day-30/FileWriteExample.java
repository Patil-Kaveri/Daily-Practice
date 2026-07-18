import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Welcome to Java File Handling.\n");
            writer.write("This file is created using FileWriter.");

            writer.close();

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
        }
    }
}