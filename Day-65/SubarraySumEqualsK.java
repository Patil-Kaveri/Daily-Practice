import java.util.HashMap;

public class SubarraySumEqualsK {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Sum 0 occurs once before starting
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : arr) {

            sum += num;

            // Check if previous sum exists
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store current sum
            map.put(
                    sum,
                    map.getOrDefault(sum, 0) + 1
            );
        }

        System.out.println(
                "Number of Subarrays: " + count
        );
    }
}