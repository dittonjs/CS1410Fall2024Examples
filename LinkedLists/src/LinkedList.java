public class LinkedList<T extends Comparable<T>> {
    private static class Node<T extends Comparable<T>> {
        T value;
        Node<T> next;
    }

    private Node<T> head = new Node<>();

    // O(n)
    public void insert(T value) {
        Node<T> previous = head;
        Node<T> current = head.next;
        while(current != null) {
            if (current.value.compareTo(value) > 0) {
                break;
            }
            previous = current;
            current = current.next;
        }
        Node<T> node = new Node<>();
        node.value = value;
        node.next = current;
        previous.next = node;
    }

    public boolean remove(T value) {
        Node<T> previous = head;
        Node<T> current = head.next;
        while(current != null) {
            if (current.value.equals(value)) {
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    public boolean search(T value) {
        Node<T> current = head.next;
        while(current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public void displayList() {
        Node<T> current = head.next;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}



/*
* value of the string
* reference to the next node in the list
*
*|     =======  ===  =====  ======= =====    ======|
*
*
* 1 -> 10 -> 32 -> 15
*       |-----------|
*
* 1 -> 10 -> 15 -> 24 -> 34
* */
