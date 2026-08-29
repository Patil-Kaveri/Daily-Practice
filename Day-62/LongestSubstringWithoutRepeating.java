import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {

        String str = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch);

            int length = right - left + 1;

            if (length > maxLength) {
                maxLength = length;
            }
        }

        System.out.println("Longest Length: " + maxLength);
    }
}