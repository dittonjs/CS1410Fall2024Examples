import java.util.ArrayList;
import java.util.HashMap;

public class Tree<T> {
    private static class Node<T> {
        T value;
        HashMap<String, Node<T>> subTree = new HashMap<>();
    }

    public static class InvalidPathException extends RuntimeException {
        public InvalidPathException() {
            super("An invalid path was given to the tree");
        }
    }

    Node<T> root = new Node<>();

    public void insert(String path, T value) {
        String[] pathStrings = path.split("/");
        insert(pathStrings, root, 0, value);
    }


    private void insert(String[] paths, Node<T> node, int i, T value) {
        if (i >= paths.length) {
            throw new InvalidPathException();
        }
        if (i == paths.length - 1) {
            Node<T> newNode = new Node<>();
            newNode.value = value;
            node.subTree.put(paths[paths.length - 1], newNode);
            return;
        }
        Node<T> next = node.subTree.get(paths[i]);
        if (next == null) {
            throw new InvalidPathException();
        }
        insert(paths, next, i+1, value);
    }

    public void displayTreePaths() {
        displayTreePaths(root, "");
    }

    private void displayTreePaths(Node<T> node, String indentation) {
        for (String subNodePath : node.subTree.keySet()) {
            System.out.println(indentation + subNodePath);
            displayTreePaths(node.subTree.get(subNodePath), indentation +  "    ");
        }
    }

    public T find(String path) {
        return find(path.split("/"), 0, root);
    }

    private T find(String[] path, int index, Node<T> node) {
        if (node == null) return null;
        if (index >= path.length) {
            return node.value;
        }
        return find(path, index+1, node.subTree.get(path[index]));
    }
}


/*
home
  documents
      file1.txt
      file2.txt
  downloads
      movie.mp4
      doc.pdf

 */
