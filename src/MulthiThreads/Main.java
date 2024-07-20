package MulthiThreads;

public class Main {
    public static void main(String[] args) {
        MultiThreads obj1 = new MultiThreads();
        ThankYou obj2 = new ThankYou();

        obj1.start();
        obj2.start();
    }
}
