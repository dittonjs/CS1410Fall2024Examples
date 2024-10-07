import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter two ints: ");
            try {
                int value1 = scanner.nextInt();
                int value2 = scanner.nextInt();
                int result = divide(value1, value2);
                System.out.println(value1/value2);
                System.out.printf("%d / %d = %d\n", value1, value2, result);
            } catch (DivideByZeroException e) {
                System.out.println(e.getMessage());
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("A math error occurred!");
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("You must enter integers!");
                scanner = new Scanner(System.in);
            } catch(Exception e){

            }

        }
    }

    public static int divide(int value1, int value2) {
        try {
            return value1 / value2;
        } catch (ArithmeticException e) {
            // check if divide by 0...

                throw new DivideByZeroException();

        }
    }
}

class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException() {
        super("Cannot divide by zero!");
    }
}
