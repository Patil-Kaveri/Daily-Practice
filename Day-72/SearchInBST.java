public class SearchInBST {

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

        // Target not found
        if (root == null) {
            return false;
        }

        // Target found
        if (root.data == target) {
            return true;
        }

        // Search left
        if (target < root.data) {
            return search(root.left, target);
        }

        // Search right
        return search(root.right, target);
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int target = 60;

        if (search(root, target)) {
            System.out.println("Element " + target + " found.");
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}