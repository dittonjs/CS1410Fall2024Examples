import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(15);
        tree.insert(9);
        tree.insert(22);
        tree.insert(18);
        tree.insert(31);
        tree.insert(1);
        tree.insert(44);
        tree.insert(6);
        tree.insert(17);
        tree.insert(16);
        tree.displayTreeStructure();
        System.out.println(tree.height());
//        tree.displayBreadthFirst();
        System.out.println();
        BinarySearchTree randomTree = genTree();
//        randomTree.displayTreeStructure();
        System.out.println(randomTree.getNodeCount());
        System.out.println(randomTree.height());
    }

    public static BinarySearchTree genTree() {
        BinarySearchTree tree = new BinarySearchTree();
        int[] data = genSortedArray();

        binaryInsert(tree, data, 0, data.length -1);
        return tree;
    }

    private static void binaryInsert(BinarySearchTree tree, int[]data, int start, int end) {
        if (start > end) return;
        int middle = (start + end) / 2;
        tree.insert(data[middle]);
        binaryInsert(tree, data, start, middle - 1);
        binaryInsert(tree, data, middle + 1, end);
    }

    public static int[] genSortedArray() {
        int[] data = new int[10000];
        for (int i = 0; i < 10000; i++) {
            data[i] = i;
        }
//        Arrays.sort(data);
        return data;
//        return new int[]{1, 6, 6, 6 ,6, 7, 7,7,7 ,8};
    }
}
