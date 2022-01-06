package com.practice.multithreading;

public class ThreadGroupExample implements Runnable{
    @Override
    public void run() {
        System.out.println("Finished thread "+Thread.currentThread().getName()+" "+Thread.currentThread().getThreadGroup().getName());
    }

    public static void main(String[] args) {
        ThreadGroup threadGroup=new ThreadGroup("Worker Threads");
        Thread t1=new Thread(threadGroup,new ThreadGroupExample());
        t1.start();
        Thread t2=new Thread(threadGroup,new ThreadGroupExample());
        t2.start();
        Thread t3=new Thread(threadGroup,new ThreadGroupExample());
        t3.start();
        System.out.println(threadGroup.activeCount());
        System.out.println(threadGroup.activeGroupCount());
        threadGroup.list();
        threadGroup.checkAccess();
    }
}
