public class App {
    public static void main(String[] args) {
        int a = 0;

        if (a < 20) {
            System.out.println("Hello!");
        } // and or not -> && || !
        else if (a >= 30 && !(a < 40)) {
            System.out.println("In the middle");
        } else {
            System.out.println("Goodbye");
        }

        int grade = 100;

        switch (grade) {
            case 100:
                int b = 10;
            case 90:
            case 80:
                System.out.println(b);
                break;
            case 70:
                System.out.println("You got a D!");
                break;
            case 60:
                System.out.println("You got a F!");
                break;
            default:
                System.out.println("Unknown grade!");
                break;
        }
    }
}
