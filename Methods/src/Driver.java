public class Driver {
    public static void main(String[] args) {
        double n, m;
        System.out.println(args[0]);

        double result = computeFactorial(5);

        System.out.println(result);
        System.out.println(computeFactorial("5.6"));
    }
    
    public static double computeFactorial(double n) {
        double result = 1;
        for (double i = n; i > 0; i --) {
            result = result * i;
        }
        return result;
    }

    public static double computeFactorial(String value) {
        double n = Double.parseDouble(value);
        return computeFactorial(n);
    }

    public static double computeFactorial(char[] value) {
        double n = Double.parseDouble("123");
        return computeFactorial(n);
    }
}
