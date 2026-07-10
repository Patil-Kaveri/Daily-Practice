public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "programming";

        System.out.println("Duplicate Characters:");

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            if (str.charAt(i) == ' ')
                continue;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (count > 1 && !alreadyPrinted) {
                System.out.println(str.charAt(i) + " : " + count);
            }
        }
    }
}