package MulthiThreads;

 class RunnableB implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thank you for helping me");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){e.printStackTrace();
            }
        }
    }
}

