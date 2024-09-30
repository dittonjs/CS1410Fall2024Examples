public class Employee extends Person {
    public int rank;
    public Employee(String name, int age, String id, int rank) {
        super(name, age, id);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
