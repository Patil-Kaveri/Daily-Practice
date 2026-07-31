import java.util.Arrays;
import java.util.List;

public class StreamAPIExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 8, 2, 9, 1, 6, 3);

        System.out.println("Even Numbers:");

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .sorted()
               .forEach(System.out::println);
    }
}