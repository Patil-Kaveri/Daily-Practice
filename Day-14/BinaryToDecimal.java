public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 1011;
        int decimal = 0;
        int base = 1;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * base;
            base *= 2;
            binary /= 10;
        }

        System.out.println("Decimal Number = " + decimal);
    }
}