import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.TimeZone;

public class Driver {
    public static void main(String[] args) {
        Professor professor = new Professor("Joseph", 32, "1231231", 1, "CS");
        Student student = new Student("Catelyn", 29, "34563456", "CS");
        Janitor janitor = new Janitor("Sophie", 4, "214350987", 4);
        Student student2 = new Student("Catelyn", 29, "34563456", "CS");
        reportPerson(professor);
        System.out.println();
        reportPerson(student);
        System.out.println();
        reportPerson(janitor);
        System.out.println();
        System.out.println(student.equals(student2));

        int[] ints = {1,2,3,4};
        ArrayList<Integer> values = new ArrayList<>();
        values.add(10);
        System.out.println(doMath(10));

        String name = "Joseph";
        for(String c : name.split("")) {
            System.out.println(c);
        }
    }


    public static void reportPerson(Person person) {
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getId());
        person.doWork();
        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println(student.getMajor());
        }
    }

    public static int doMath(Integer value) {
        return value * 2;
    }
}
