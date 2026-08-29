public class MaximumSumSubarray {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;
        int maxSum = 0;

        // Calculate first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum + arr[i] - arr[i - k];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        System.out.println("Maximum Sum: " + maxSum);
    }
}