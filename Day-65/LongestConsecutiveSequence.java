import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        // Add all elements to HashSet
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // Check if num is the starting number
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                if (count > longest) {
                    longest = count;
                }
            }
        }

        System.out.println(
                "Longest Consecutive Length: " + longest
        );
    }
}