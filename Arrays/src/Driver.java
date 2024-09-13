import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int number = 10;
        int[] numbers = {1, 2, 3, 4, 5, 234, 5432, 4, 1, 3};
        printArray(numbers);
        System.out.println();
        int[] userNumbers = new int[3];
//        String[] strings = new String[12];
//        printArray(strings);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input 3 integers: ");
//        userNumbers[0] = scanner.nextInt();
//        userNumbers[1] = scanner.nextInt();
//        userNumbers[2] = scanner.nextInt();


        printArray(userNumbers);
        int num = 10;
        doubleValue(num);
        System.out.println(num);

        int[] values = {10};
        doubleFirstThingInArray(values);
        System.out.println(values[0]);

        int[][] values2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
    }

    public static void doubleValue(int num) {
        num *= 2;
    }

    public static void doubleFirstThingInArray(int[] values) {
        values[0] *= 2;
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.printf(
                    "The value at position %d is %5d\n",
                    i,
                    values[i]
            );
        }
    }

    public static void printArray(String[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.printf(
                    "The value at position %d is %s\n",
                    i,
                    values[i]
            );
        }
    }

}
