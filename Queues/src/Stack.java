public class Stack<T> {
    private static class Node<T> {
        T value;
        Node<T> next;
    }

    public static class StackEmptyException extends RuntimeException {
        public StackEmptyException() {
            super("Stack is empty.");
        }
    }

    private Node<T> top;

    public void push(T value) {
        Node<T> newNode = new Node<>();
        newNode.value = value;
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public T peek() {
        if (top == null) {
            throw new StackEmptyException();
        }
        return top.value;
    }

    public T pop() {
        if (top == null) {
            throw new StackEmptyException();
        }
        T value = top.value;
        top = top.next;
        return value;
    }

}
