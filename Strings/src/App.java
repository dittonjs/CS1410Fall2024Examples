import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        String correctPassword = "password123";
//
        Scanner scanner = new Scanner(System.in);
//        System.out.print("What is the password?: ");
//        String password = scanner.next();
//
//        if (password.equals(correctPassword)) {
//            System.out.println("Welcome!");
//        } else {
//            System.out.println("Wrong password!");
//        }
        double result = 10.0/3.0;
        System.out.print("How many spaces?: ");

        int spaces = scanner.nextInt();
//        String output = String.format("The result is %" + spaces + ".4f", result);
//        String output1 = String.format("The result is %" + spaces + ".2f", .234);
//        String output2 = String.format("The result is %" + spaces + ".2f", 1.234234);
//        String output3 = String.format("The result is %" + spaces + ".2f", 2.33);
//        String output4 = String.format("The result is %" + spaces + ".2f", 2.33);
//        System.out.println(output);
//        System.out.println(output1);
//        System.out.println(output2);
//        System.out.println(output3);
//        System.out.println(output4);
        int a = 1234;

        a += 10;
        int numDigits = ("" + a).length();
        String b = "Hello, world! ";
        b += "Joseph";

        System.out.println(b);


        System.out.printf("The result is %-" + spaces + ".4f yo!\n", result);
        System.out.printf(
                "Number 1 is %d, number 2 is %f, value 3 is %s",
                10,
                34.5,
                "Hello world!"
        );
    }
}