public class Person {
    private Name name;
    private Role role = Role.ADMIN;
    private int age;
    private double height;
    private static int numPersons = 0;


    public Person(String fullName, int age, double height) {
        setName(fullName);
        setAge(age);
        setHeight(height);
        numPersons ++;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public String getName() {
        return name.getFullName();
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("YOU CANT CREATE A PERSON WITHOUT A NAME");
        }
        String[] parts = name.split(" ");

        this.name = new Name(parts[0], parts[1]);
    }

    public static int getNumPersons() {
        return numPersons;
    }
}

