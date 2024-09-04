public class App {
    public static void main(String[] args) {
        int a = 0;

        if (a < 20) {
            System.out.println("Hello!");
        } // and or not -> && || !
        else if(a >= 30 && !(a < 40)) {
            System.out.println("In the middle");
        }
        else {
            System.out.println("Goodbye");
        }
    }
}
