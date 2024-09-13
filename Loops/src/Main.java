import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter 2 numbers (exit to quit): ");
            input = scanner.next();
            if (!input.equals("exit")) {
                int num1 = Integer.parseInt(input);
                int num2 = scanner.nextInt();
                System.out.printf("Result %d\n", num1 + num2);
            } else {
                break;
            }
        } while(true);
//        int num = scanner.nextInt();
//
//
//        for(int i = 1; i < num; i*=10) {
//            System.out.println(i);
//        }

//        int width = 11;
//        int height = 15;
//        int middleCol = width / 2;
//        int middleRow = height / 2;
//        int radius = 5;
//        for(int row = 0; row < height; row ++) {
//            for (int col = 0; col < width; col ++) {
//                boolean isInCircle = Math.sqrt(
//                        Math.pow(row - middleRow, 2) + Math.pow(col - middleCol, 2)
//                ) < radius;
//                if (isInCircle) {
//                    System.out.printf("%3s", "*");
//                } else {
//                    System.out.printf("%3s", ".");
//                }
//            }
//            System.out.println();
//        }

    }
}
