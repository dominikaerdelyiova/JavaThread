package sk.kosickaakademia.de.thread;

public class PrimeNumberThread extends Thread {
    private String threadName;
    private int base;
    private Thread;

    public PrimeNumberThread(String threadName, String threadName1, int base) {
        super(threadName);
        this.threadName = threadName;
        this.base = base;
    }

    @Override
    public void run() {
        System.out.println("Thread is running");

        System.out.println("Thread finished");

        PrimeNumberThread pnt=
                new PrimeNumberThread("primeThread", base:115628476);
        pnt.start();
    }

    @Override
    public void start(){

    }
}
