public class StaticQueue {
    private String[] queue = new String[5];
    int start = 0;
    int end = -1;
    int size = 0;
    // [null, "World", "!"]
    //    ^       ^
    public void enqueue(String item) {
        if (size == queue.length) {
            throw new RuntimeException("Queue is full");
        }
        size ++;
        end ++;
        if (end == queue.length) {
            end = 0;
        }
        queue[end] = item;
    }

    public String dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        size --;
        String item = queue[start];
        start ++;
        if (start == queue.length) {
            start = 0;
        }
        return item;
    }

    public int getSize() {
        return size;
    }
}
