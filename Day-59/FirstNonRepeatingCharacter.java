import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "aabbcdde";

        HashMap<Character, Integer> frequency = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        // Find first character with frequency 1
        for (char ch : str.toCharArray()) {

            if (frequency.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}