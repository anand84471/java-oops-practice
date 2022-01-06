package com.practice.multithreading;

public class ThreadExampleUsingThread extends Thread{
    @Override
    public void run() {
        super.run();
        for(var i=0;i<1000;i++){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread is executing"+i);
        }

    }
    public static void main(String[] args) {
        ThreadExampleUsingThread thread=new ThreadExampleUsingThread();
        ThreadExampleUsingThread thread1=new ThreadExampleUsingThread();
        thread.start();
        thread.start();
        thread1.start();
    }
}
