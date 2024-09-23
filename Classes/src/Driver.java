public class Driver {
    public static void main(String[] args) {
        Person person = new Person("Joseph Ditton", 32, 6.1);
        Person person2 = new Person("Catelyn Ditton", 29, 5.25);
        System.out.println(Person.getNumPersons());
        System.out.println(Math.sin(3.1415));
        Course course = new Course();
        course.addPerson(person);

        for (Person student : course.getStudents()) {
            displayPerson(student);
        }
    }

    public static void displayPerson(Person person) {
        System.out.printf("%s is %d years old and is %f feet tall and is a(n) %s.\n", person.getName(), person.getAge(), person.getHeight(), person.getRole());
    }
}

