public class Driver {
    public static void main(String[] args) {

    }

    //O(n!)
    //O(2^n)
    public static void crackPassword() {

    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    

    public static int betterFib(int n) {

        int num = 0;
        int prev = 1;
        for (int i = 0; i < n; i++) {
            int temp  = prev + num;
            prev = num;
            num = temp;
        }
        return num;
    }

    public static int bestFib(int n) {

    }


    //O(n^2)
    //100 + 99 + 98 + ... + 1
    //100*100
    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - j; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    //O(n) linear time
    public static void doWork(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = 2 * data[i] + 11 / 4 % 23;
        }

        for (int i = data.length -1; i > 0; i /= 2) {
            data[i] = data[i] / 2;
        }

        data[10] = 11;
    }

    //O(1) Constant time
    public static void doWork2(int[] data) {
        data[0] = 10;
        data[1] = 4;
        data[2] = 6;
    }
}
