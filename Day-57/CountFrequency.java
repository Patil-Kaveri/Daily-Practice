import java.util.HashMap;

public class CountFrequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {

            frequency.put(
                num,
                frequency.getOrDefault(num, 0) + 1
            );
        }

        System.out.println("Frequency:");

        for (int key : frequency.keySet()) {
            System.out.println(key + " -> " + frequency.get(key));
        }
    }
}