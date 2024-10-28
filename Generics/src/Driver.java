import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        MyTopThree<Integer> favoriteInts = new MyTopThree<>();

        favoriteInts.setFirst(10);
        System.out.println(favoriteInts.getFirst());

        MyTopThree<String> favoriteStrings = new MyTopThree<>();
    }
}

class MyTopThree<T> {
    private T first;
    private T second;
    private T third;

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }
}
