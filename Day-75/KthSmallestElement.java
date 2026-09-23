import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    static int findKthSmallest(int[] arr, int k) {

        // Max Heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {

            maxHeap.add(num);

            // Keep only k smallest elements
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.peek();
    }

    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};

        int k = 3;

        int result = findKthSmallest(arr, k);

        System.out.println("Kth Smallest Element: " + result);
    }
}