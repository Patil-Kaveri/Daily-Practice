public class InorderTraversal {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        // Visit left subtree
        inorder(root.left);

        // Visit root
        System.out.print(root.data + " ");

        // Visit right subtree
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder Traversal:");

        inorder(root);
    }
}