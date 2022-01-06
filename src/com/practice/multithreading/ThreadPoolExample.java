package com.practice.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements  Runnable{
     WorkerThread(String name){
        Thread.currentThread().setName(name);
    }
    @Override
    public void run() {
        System.out.println("Finished thread "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable t1=new WorkerThread("1");
        Runnable t2=new WorkerThread("2");
        ExecutorService executor= Executors.newFixedThreadPool(5);
        executor.execute(t1);
        executor.execute(t2);
        executor.shutdown();
        while (!executor.isTerminated()){}
        System.out.println("Finished all threads");
    }
}
