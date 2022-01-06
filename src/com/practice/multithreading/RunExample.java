package com.practice.multithreading;

public class RunExample implements Runnable{
    @Override
    public void run() {
        try {
            for (int i=0;i<5;i++) {
                Thread.sleep(100);
                System.out.println(i);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new RunExample());
        Thread th2=new Thread(new RunExample());
//        t1.start();
//        th2.start();
        t1.run();
        th2.run();

    }
}
