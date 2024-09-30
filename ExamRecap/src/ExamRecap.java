public class ExamRecap {
    public static void main(String[] args) {
        int max = 0;
        doubleMax(1, 2, max);
        System.out.println(max);
    }

    public static void doubleMax(int value1, int value2, int max) {
        if (value1 > value2) {
            max = value1;
        }
        else {
            max = value2;
        }
        max *= 2;
    }
}

// Because Java is pass-by-value,
// when an array is passed as a parameter to a method,
// the contents of the array are copied.

