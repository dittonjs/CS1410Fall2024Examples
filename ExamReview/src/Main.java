import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static final String APPLICATION_URL = "www.something.com";

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        System.out.println(a);
//        int a = 10;
//        int b = a + 10;
//        int c = b;
//        int d = a;
//        int e = b + a + d + 5;
//
//        /*
//            boolean 1bit
//            byte char 1byte
//            short 2byte
//            int float 4byte
//            long double 8byte
//
//            int a = 10;
//            double b = a;
//
//
//
//            int c = (int)b;
//         */
//        long l = 10;
//        int g = 10;
//        char ch = 'a';
//        int something = ch;
//        float f = g;
//        long timestamp = System.currentTimeMillis();
//        System.out.println(timestamp);
//        System.out.println((int)timestamp);
//        System.out.println(Math.pow(2, 64));
//        char value = 10;
//        switch (value) {
//            case 8:
//                System.out.println("It was eight!");
//                break;
//            case 10:
//                System.out.println("It was ten!");
//            case 12:
//                System.out.println("Twelve");
//            default:
//                System.out.println("Again");
//        }
//

        boolean a = false;
        boolean b = true;
        boolean c = true;

        System.out.println("My mom said,\\ \"Go to your room\"! \n\"No!\", I said!");
        double money = -3.45045;
        System.out.printf("===========$%-10s", money);

        /*
            int i;
            for(i = 0;i < 10;i++) {
                int a
                //print i
            }
            print i
         */

        int[] values = {1,2,3,4,5};
        int[] values2 = int[5];
        int a = 10;
        doMath(a);
        System.out.println(a);
    }

    public static void doMath(int a) {
        a*=2;
    }

//    public static int doMath(int someName)

}
