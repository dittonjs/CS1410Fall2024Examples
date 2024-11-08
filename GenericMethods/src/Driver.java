public class Driver {
    public static void main(String[] args) {
        Integer[] data = {34,23,645,23,321,456,322,33,6,345};
        System.out.println(findMin(data));
        Double[] data2 = {43.2, 4345.2, 123.5, 44.7};
        System.out.println(findMin(data2));
        Square[] squares = {
                new Square(4),
                new Square(2),
                new Square(1),
                new Square(8),
                new Square(3),
        };

        System.out.println(findMin(squares).getArea());

    }

    public static <T extends Comparable<T>> T findMin(T[] data) {
        return findMin(data, 0);
    }

    // {1,3,5,76,32,43}
    // what is smaller 1 or smallest of the rest of the array
    private static <T extends Comparable<T>> T findMin(T[] data, int start) {
        if (start == data.length - 1) return data[start];
        T minOfTheRest = findMin(data, start+1);

        if (minOfTheRest.compareTo(data[start]) > 0) {
            return data[start];
        } else {
            return minOfTheRest;
        }

    }
}

class Square implements Comparable<Square> {
    private final double size;
    public Square(double size) {
        this.size = size;
    }

    public double getArea(){
        return size * size;
    }

    @Override
    public int compareTo(Square o) {
        return Double.compare(getArea(), o.getArea());
    }
}
