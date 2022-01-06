package com.practice.multithreading;

public class ThreadExampleUsingRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("The thread is running");
    }

    public static void main(String[] args) {
        ThreadExampleUsingRunnable runnable=new ThreadExampleUsingRunnable();
        Thread thread1=new Thread(runnable);
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());
        thread1.interrupt();
        System.out.println(thread1.getState());
    }
}
