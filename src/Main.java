public class Main {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("Creating a new thread");
        };

        Thread thread1 = new Thread(runnable);

        thread1.start();
    }
}