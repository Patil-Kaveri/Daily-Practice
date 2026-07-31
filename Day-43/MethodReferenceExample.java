import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {

        List<String> languages = Arrays.asList(
                "Java",
                "Python",
                "C++",
                "JavaScript");

        System.out.println("Programming Languages:");

        // Method Reference
        languages.forEach(System.out::println);
    }
}