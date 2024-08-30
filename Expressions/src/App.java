import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14;
//        System.out.print("Give me the radius: ");
//        double radius = scanner.nextDouble();
//
//        double area = pi * radius * radius;
//
//        System.out.println("Area of circle with radius " + radius + " is " + area);
        double res = Math.sqrt(1234.5);
        System.out.print("Input the width and height of a rectangle: ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        System.out.println("The area of the rectangle is " + (width * height));

        System.out.println("That third number is " + scanner.nextInt());
        System.out.println(scanner.nextInt());

    }
}
