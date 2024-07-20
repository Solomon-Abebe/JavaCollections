package MulthiThreads;

public class MultiThreads extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("God Help Me to join MIU");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){e.printStackTrace();
            }
        }
    }

}
