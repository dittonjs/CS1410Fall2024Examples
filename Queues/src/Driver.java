public class Driver {
    public static void main(String[] args) {
        Queue<Double> nums = new Queue<>();
        nums.enqueue(10.2);
        nums.enqueue(3.243);
        nums.enqueue(5.67);
        nums.enqueue(12.4);

        nums.forEach((num) -> {
            System.out.println(num * 2);
        });
        
        while(!nums.isEmpty()) {
            System.out.println(nums.dequeue());
        }
        System.out.println();
        Stack<String> names = new Stack<>();
        names.push("Joseph");
        names.push("Catelyn");
        names.push("Sophie");
        names.push("Thomas");

        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());

    }
}

