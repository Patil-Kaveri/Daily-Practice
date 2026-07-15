public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 13;
        String binary = "";

        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }

        System.out.println("Binary Number = " + binary);
    }
}