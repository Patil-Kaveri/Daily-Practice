import java.util.PriorityQueue;

public class KthLargestElement {

    static int findKthLargest(int[] arr, int k) {

        // Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {

            minHeap.add(num);

            // Keep only k largest elements
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 6, 4};

        int k = 2;

        int result = findKthLargest(arr, k);

        System.out.println("Kth Largest Element: " + result);
    }
}