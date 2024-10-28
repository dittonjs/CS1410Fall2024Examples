public class Driver {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.insert(10);
        nums.insert(12);
        nums.insert(34);
        nums.insert(32);
        nums.insert(546);
        nums.insert(1);
        nums.insert(23);
        nums.displayList();
        System.out.println();
        nums.remove(546);
        nums.displayList();
    }
}
