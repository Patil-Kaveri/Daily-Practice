public class SumOfAllNodes {

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

    static int sum(Node root) {

        // Empty tree
        if (root == null) {
            return 0;
        }

        // Sum of root + left subtree + right subtree
        return root.data
                + sum(root.left)
                + sum(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        int result = sum(root);

        System.out.println("Sum of all nodes: " + result);
    }
}