public class FindMaximumInBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMaximum(Node root) {

        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        Node current = root;

        // Move to the rightmost node
        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int maximum = findMaximum(root);

        System.out.println("Maximum value: " + maximum);
    }
}