public class Queue<T> {
    private static class Node<T> {
        T value;
        Node<T> next;
    }
    private Node<T> head = null;
    private Node<T> tail = null;

    public static class QueueEmptyException extends RuntimeException {
        public QueueEmptyException() {
            super("Queue is empty.");
        }
    }

    public interface ForEachHandler<T> {
        void callback(T value);
    }

    public void enqueue(T value) {
        Node<T> node = new Node<>();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public T dequeue() {
        if (head == null) {
            throw new QueueEmptyException();
        }
        T value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void forEach(ForEachHandler<T> handler) {
        Node<T> node = head;
        while(node != null) {
            handler.callback(node.value);
            node = node.next;
        }
    }

}
