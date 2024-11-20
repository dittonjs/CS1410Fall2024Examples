public class Driver {
    public static void main(String[] args) {
        StaticQueue queue = new StaticQueue();
        queue.enqueue("Hello");
        queue.enqueue("World");
        queue.enqueue("!");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue("Goodbye");
        queue.enqueue("World");
        queue.enqueue("!");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}


