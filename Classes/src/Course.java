import java.util.ArrayList;

public class Course {
    private final ArrayList<Person> students = new ArrayList<>();

    public void addPerson(Person person) {
        students.add(person);
    }

    public ArrayList<Person> getStudents() {
        return students;
    }
}
