public class Driver {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Joseph";
        person.height = 6;
        person.age = 32;

        displayPerson(person);
    }

    public static void displayPerson(Person person) {
        System.out.printf("%s is %d years old and is %f feet tall.\n", person.name, person.age, person.height);
    }
}

class Person {
    public double height;
    public int age;
    public String name;
}
