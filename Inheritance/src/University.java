import java.util.ArrayList;

public class University {
    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void reportPeople() {
        for(Person person: people) {
            Driver.reportPerson(person);
        }
    }
}
