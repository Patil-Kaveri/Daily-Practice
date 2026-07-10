public class RemoveWhiteSpaces {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        // Remove all spaces
        str = str.replaceAll("\\s", "");

        System.out.println("String after removing spaces:");
        System.out.println(str);
    }
}