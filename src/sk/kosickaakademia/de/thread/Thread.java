package sk.kosickaakademia.de.thread;

public class Thread implements Runnable {
    private String threadName;
    private Thread t;

    @Override
    public void run() {
        System.out.println("Running"+threadName);

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread" + threadName + ":value:" + i);
                Thread.sleep(1000);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Thread"+threadName+"existing.");

    }

    private static void sleep(int millis) {
    }

    public Thread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating"+threadName);
    }

    public void start(){
        System.out.println("Starting"+ threadName);
        t=new Thread(threadName);
        t.start();
    }
}

