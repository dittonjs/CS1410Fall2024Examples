public class Person extends Object {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void doWork(){
        System.out.println("I am doing work!");
    }

    @Override
    public String toString() {
        return name +
                "\n" +
                age +
                "\n" +
                id +
                "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return other.id.equals(this.id);
    }
}
