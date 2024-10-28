import java.util.ArrayList;
import java.util.function.Consumer;

public class Driver {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i ++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        startProcess(runnable);
        startProcess(runnable);

        startProcess(() -> System.out.println("Hello"));

        startProcess(() -> {
            // read a file
        });

        ArrayList<String> names = new ArrayList<>();
        names.add("Joseph");
        names.add("Joseph 1");
        names.add("Joseph 2");
        names.add("Joseph 3");
        names.add("Joseph 4");

    }

    private static Thread startProcess(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.start();
        return thread;
    }
}

