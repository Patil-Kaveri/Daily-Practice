import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10};

        int[] result = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            // Remove smaller elements
            while (!stack.isEmpty() &&
                   stack.peek() <= arr[i]) {

                stack.pop();
            }

            // Find next greater element
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Add current element
            stack.push(arr[i]);
        }

        System.out.println("Next Greater Elements:");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}