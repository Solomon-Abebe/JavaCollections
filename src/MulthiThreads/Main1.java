package MulthiThreads;

 class Main1 {
    public static void main(String[] args) {
        //Objects
        Runnable obj1 = new RunnableA();
      //  Runnable obj2 = new RunnableB();

        //Or anonymous class (expression)
        //Runnable obj2 = new Runnable(){

        //Or lambda expression
        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thank you for helping me");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        //Constructors

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();
    }
}
