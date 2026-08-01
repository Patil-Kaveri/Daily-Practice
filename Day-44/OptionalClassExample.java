import java.util.Optional;

public class OptionalClassExample {

    public static void main(String[] args) {

        String name = null;

        Optional<String> optional = Optional.ofNullable(name);

        if (optional.isPresent()) {
            System.out.println("Name: " + optional.get());
        } else {
            System.out.println("Name is not available.");
        }

        // Using orElse()
        String result = optional.orElse("Default Name");
        System.out.println("Result: " + result);
    }
}