public class Driver {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Parallelogram parallelogram = new Parallelogram();
        Square square = new Square();
    }
}

class GeometricShape {
    private String color;
    public GeometricShape() {
        System.out.println("I don't know what I am yet!");
    }

    public GeometricShape(String color) {
        this.color = color;
    }
}

class Circle extends GeometricShape {
    private int radius;
    public Circle() {
        this("blue");
        System.out.println("I am a circle!");
    }

    public Circle(String color) {
        this(color, 1);
    }

    public Circle(String color, int radius) {
        // complex logic
        this.radius = radius;
    }

    private void init() {

    }
}

class Parallelogram extends GeometricShape {
    public Parallelogram() {
        System.out.println("I am a parallelogram!");
    }
}

class Square extends Parallelogram {
    public Square() {
        System.out.println("I am a square!");
    }
}
