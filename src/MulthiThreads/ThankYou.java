package MulthiThreads;

public class ThankYou extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thank you for helping me");
            // the try-catch is optional just to give some time-lapse for the thread
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){e.printStackTrace();
            }
        }
    }
}
