public class SearchInBinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static boolean search(Node root, int target) {

        // Tree is empty
        if (root == null) {
            return false;
        }

        // Target found
        if (root.data == target) {
            return true;
        }

        // Search in left subtree
        if (search(root.left, target)) {
            return true;
        }

        // Search in right subtree
        return search(root.right, target);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        int target = 50;

        if (search(root, target)) {
            System.out.println("Element " + target + " found in the tree.");
        } else {
            System.out.println("Element " + target + " not found in the tree.");
        }
    }
}