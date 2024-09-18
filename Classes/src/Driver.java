import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Person person = new Person("", 32, 6.1);
        displayPerson(person);
    }

    public static void displayPerson(Person person) {
        System.out.printf("%s is %d years old and is %f feet tall.\n", person.getName(), person.getAge(), person.getHeight());
    }
}

