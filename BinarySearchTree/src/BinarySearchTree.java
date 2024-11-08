public class BinarySearchTree {
    private class Node {
        int value;
        Node left;
        Node right;
    }

    Node root;

    public void insert(int value) {
        Node node = new Node();
        node.value = value;
        if (root == null) {
            root = node;
            return;
        }

        Node parent = null;
        Node current = root;
        while(current != null) {
            parent = current;
            if (value < current.value) { // go left
                current = current.left;
            } else { // go right
                current = current.right;
            }
        }
        if (value < parent.value) { // go left
            parent.left = node;
        } else { // go right
            parent.right = node;
        }
    }
}
