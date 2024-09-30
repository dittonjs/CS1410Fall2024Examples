public class Janitor extends Employee {

    public Janitor(String name, int age, String id, int rank) {
        super(name, age, id, rank);
    }

    @Override
    public void doWork() {
        System.out.println("I am cleaning the elevator!");
    }
}
