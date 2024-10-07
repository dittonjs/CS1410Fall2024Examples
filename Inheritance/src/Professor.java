public class Professor extends Employee {
    private String department;


    public Professor(String name, int age, String id, int rank, String department) {
        super(name, age, id, rank);
        this.department = department;
    }

    @Override
    public void doWork(){
        System.out.println("I am grading homework!");
    }

    public String getDepartment() {
        return department;
    }
}
