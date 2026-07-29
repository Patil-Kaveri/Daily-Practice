import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        Iterator<String> iterator = languages.iterator();

        System.out.println("Languages:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}