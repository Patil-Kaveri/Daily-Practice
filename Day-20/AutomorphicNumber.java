public class AutomorphicNumber {
    public static void main(String[] args) {
        int number = 25;
        int square = number * number;

        if (String.valueOf(square).endsWith(String.valueOf(number))) {
            System.out.println(number + " is an Automorphic Number.");
        } else {
            System.out.println(number + " is not an Automorphic Number.");
        }
    }
}