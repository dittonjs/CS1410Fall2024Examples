import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedExceptions {
    public static void main(String[] args) {
//        try {
//            printSlowly();
//
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }


        try {
            getIntFromUser();
        } catch (BadIntInputException e) {
            System.out.printf("String %s does not match an integer", e.getInput());
        }
    }

    public static void printSlowly() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static int getIntFromUser() throws BadIntInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me an int: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new BadIntInputException(scanner.next());
        }
    }
}

class BadIntInputException extends Exception {
    private String input;
    public BadIntInputException(String input) {
        super("asdfasdf");
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}
