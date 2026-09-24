import java.util.*;

public class TopKFrequentElements {

    static int[] topKFrequent(int[] arr, int k) {

        // Count frequency of each element
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> frequency.get(a) - frequency.get(b)
        );

        // Add elements to heap
        for (int num : frequency.keySet()) {

            minHeap.add(num);

            // Keep only k elements
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Store result
        int[] result = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3};

        int k = 2;

        int[] result = topKFrequent(arr, k);

        System.out.println("Top " + k + " Frequent Elements:");

        System.out.println(Arrays.toString(result));
    }
}