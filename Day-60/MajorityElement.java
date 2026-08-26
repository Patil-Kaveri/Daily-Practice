import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        int majority = -1;

        for (int num : arr) {

            frequency.put(
                num,
                frequency.getOrDefault(num, 0) + 1
            );

            if (frequency.get(num) > arr.length / 2) {
                majority = num;
                break;
            }
        }

        if (majority != -1) {
            System.out.println("Majority Element: " + majority);
        } else {
            System.out.println("No Majority Element");
        }
    }
}