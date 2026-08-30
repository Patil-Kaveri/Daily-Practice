public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 40;

        int left = 0;
        int right = arr.length - 1;

        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}