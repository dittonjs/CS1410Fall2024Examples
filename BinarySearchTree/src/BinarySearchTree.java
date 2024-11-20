public class BinarySearchTree {
    private static class Node {
        int value;
        Node left;
        Node right;
    }

    private int nodeCount = 0;

    Node root;

    public void insert(int value) {
        Node node = new Node();
        node.value = value;
        // handle the first node being inserted
        if (root == null) {
            root = node;
            nodeCount++;
            return;
        }

        // find the parent of the new node
        Node parent = null;
        Node current = root;
        while(current != null) {
            parent = current;
            if (value < current.value) { // go left
                current = current.left;
            }
            else if (value == current.value) {
                return;
            }
            else { // go right
                current = current.right;
            }
        }

        // figure out which side to attach node to
        if (value < parent.value) {
            parent.left = node;
        } else { // go right
            parent.right = node;
        }
        nodeCount++;
    }

    public boolean search(int value) {
        return search(value, root);
    }

    private boolean search(int value, Node node) {
        if (node == null) return false;
        if (node.value == value) return true;
        if (value < node.value) {
            return search(value, node.left);
        } else {
            return search(value, node.right);
        }
    }

    public void displayTreeStructure() {
        displayTreeStructure(root, "");
    }

    private void displayTreeStructure(Node node, String indent) {
        if (node == null) return;
        displayTreeStructure(node.right, indent + "    ");
        System.out.println(indent + node.value);
        displayTreeStructure(node.left, indent + "    ");
    }

    public void remove(int value) {
        Node parent = null;
        Node node = root;
        boolean done = false;
        while (!done && node != null) {
            if (value < node.value) {
                parent = node;
                node = node.left;
            } else if (value == node.value) {
                done = true;
            } else {
                parent = node;
                node = node.right;
            }
        }

        if (node == null) return;

        if (node.left == null) { // no left subtree
            if (parent == null) {
                root = node.right;
            } else if (parent.left == node) {
                parent.left = node.right;
            } else {
                parent.right = node.right;
            }
        } else { // there is a left subtree
            Node parentOfRightMost = node;
            Node rightMost = node.left;
            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }
            node.value = rightMost.value;
            if (parentOfRightMost.left == rightMost) {
                parentOfRightMost.left = rightMost.left;
            } else {
                parentOfRightMost.right = rightMost.left;
            }
        }
        nodeCount--;
    }

    public int height() {
        return height(root, -1);
    }
    // log2()
    private int height(Node node, int height) {
        if (node == null) return height;
        // get the height of the left subtree
        int leftHeight = height(node.left, height + 1);
        int rightHeight = height(node.right, height + 1);
        return Math.max(leftHeight, rightHeight);
    }

    public int getNodeCount() {
        return nodeCount;
    }
}
