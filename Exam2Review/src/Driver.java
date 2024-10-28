public class Driver {
    public static void main(String[] args) {
        int[][] data = {
                {1,2},
                {4,5,3},
                {7,8},
                {1,},
                {2,3}
        };

        int[][] data2 = new int[4][];
        int[][] data3 = {
                {1},
                {1,2},
                {1,2,3}
        };

        Integer[] persons = new Integer[5];
        System.out.println(persons[0]);
        Person person = getPerson();
        person
                .chain()
                .chain()
                .chain()
                .chain();

        System.out.println(
                Person.getInstanceCount()
        );

        Person one = new Person("");
        Person two = one;

        int a = 10;
        Integer b = a;
        int c = b;

    }

    public static void personPerson(Person person) {
        System.out.println(person);
    }

    public int[][] generateRandomGridOfInts(int[][] data) {
        return new int[5][5];
    }

    public static Person getPerson() {
        return new Person("Joseph");
    }
    /*
    *
    * aggregation
    * composition
    * association
    * */




}


class Person {
    private static int instanceCount = 0;
    private String name;
    public Person(String name) {
        this.name = name;
        instanceCount ++;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
    public Person chain() {
        return this;
    }
}