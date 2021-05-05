package sk.kosickaakademia.de.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");
        Thread thread1= new Thread("Thread 1");
        thread1.start();

        Thread thread2= new Thread("Thread 2");
        thread2.start();
        System.out.println("Main finished");
    }
}
