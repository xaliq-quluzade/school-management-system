package main;

public class CustomExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Thread: " + t.getName() + ", Error: " + e.getMessage());
    }
}