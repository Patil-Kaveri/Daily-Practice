public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 23, 89, 34};
        int key = 23;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}