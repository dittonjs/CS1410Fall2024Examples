public class Student extends Person {
    private String major;

    public Student(String name, int age, String id, String major) {
        super(name, age, id);
        this.major = major;
    }

//    @Override
    public void doWork() {
        System.out.println("I am doing homework!");
    }

    public String getMajor() {
        return major;
    }
}
