import java.util.*;

public class MergeKSortedArrays {

    static class Element {
        int value;
        int arrayIndex;
        int elementIndex;

        Element(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;
        }
    }

    static int[] mergeArrays(int[][] arrays) {

        PriorityQueue<Element> minHeap =
            new PriorityQueue<>(
                (a, b) -> a.value - b.value
            );

        int totalElements = 0;

        // Add first element of every array
        for (int i = 0; i < arrays.length; i++) {

            totalElements += arrays[i].length;

            if (arrays[i].length > 0) {
                minHeap.add(
                    new Element(arrays[i][0], i, 0)
                );
            }
        }

        int[] result = new int[totalElements];

        int index = 0;

        while (!minHeap.isEmpty()) {

            Element current = minHeap.poll();

            result[index++] = current.value;

            int nextIndex = current.elementIndex + 1;

            // Add next element from same array
            if (nextIndex < arrays[current.arrayIndex].length) {

                minHeap.add(
                    new Element(
                        arrays[current.arrayIndex][nextIndex],
                        current.arrayIndex,
                        nextIndex
                    )
                );
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] arrays = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        int[] result = mergeArrays(arrays);

        System.out.println("Merged Array:");

        System.out.println(Arrays.toString(result));
    }
}