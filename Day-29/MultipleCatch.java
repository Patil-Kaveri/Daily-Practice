public class MultipleCatch {
    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);

            int result = 10 / 0;

            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception Caught.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught.");
        } catch (Exception e) {
            System.out.println("General Exception Caught.");
        }

        System.out.println("Program Ended Successfully.");
    }
}