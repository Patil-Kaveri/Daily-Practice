public class PostorderTraversal {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void postorder(Node root) {

        if (root == null) {
            return;
        }

        // Visit left subtree
        postorder(root.left);

        // Visit right subtree
        postorder(root.right);

        // Visit root
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Postorder Traversal:");

        postorder(root);
    }
}