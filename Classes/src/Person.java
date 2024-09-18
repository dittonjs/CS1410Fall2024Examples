public class Person {
    private Name name;
    private int age;
    private double height;

    public Person(String fullName, int age, double height) {
        setName(fullName);
        setAge(age);
        setHeight(height);
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
        if (name.isEmpty() || name == null) {
            throw new RuntimeException("YOU CANT CREATE A PERSON WITHOUT A NAME");
        }
        String[] parts = name.split(" ");
        this.name = new Name(parts[0], parts[1]);
    }
}

