public class DeleteNodeInBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node delete(Node root, int key) {

        if (root == null) {
            return null;
        }

        // Search in left subtree
        if (key < root.data) {
            root.left = delete(root.left, key);
        }

        // Search in right subtree
        else if (key > root.data) {
            root.right = delete(root.right, key);
        }

        // Node found
        else {

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (root.left == null) {
                return root.right;
            }

            // Case 2: Only left child
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node successor = findMinimum(root.right);

            root.data = successor.data;

            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    static Node findMinimum(Node root) {

        Node current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println("Before deletion:");

        inorder(root);

        System.out.println();

        root = delete(root, 30);

        System.out.println("After deleting 30:");

        inorder(root);
    }
}