public class Driver {
    public static void main(String[] args) {
        Professor professor = new Professor("Joseph", 32, "1231231", 1, "CS");
        Student student = new Student("Catelyn", 29, "34563456", "CS");
        Janitor janitor = new Janitor("Sophie", 4, "214350987", 4);



        reportPerson(professor);
        System.out.println();
        reportPerson(student);
        System.out.println();
        reportPerson(janitor);
    }


    public static void reportPerson(Person person) {
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getId());
        person.doWork();
    }
}
