public class LinkedList<T> {
    private static class Node<T> {
        T value;
        Node<T> next;
    }

    private Node<T> head = new Node<>();
    private Node<T> tail = null;
    // O(n)
    public void insert(T value) {
        Node<T> newNode = new Node<>();
        newNode.value = value;
        if (tail == null) {
            head.next = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean remove(T value) {
        Node<T> previous = head;
        Node<T> current = head.next;
        while(current != null) {
            if (current.value.equals(value)) {
                previous.next = current.next;
                if (current == tail) {
                    tail = previous;
                }
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
