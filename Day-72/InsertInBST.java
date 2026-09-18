public class InsertInBST {

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

    static Node insert(Node root, int value) {

        // If tree is empty, create a new node
        if (root == null) {
            return new Node(value);
        }

        // Go to left subtree
        if (value < root.data) {
            root.left = insert(root.left, value);
        }

        // Go to right subtree
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        // If value already exists, do nothing
        return root;
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

        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.println("BST before adding 25:");

        inorder(root);

        System.out.println();

        root = insert(root, 25);

        System.out.println("BST after adding 25:");

        inorder(root);
    }
}