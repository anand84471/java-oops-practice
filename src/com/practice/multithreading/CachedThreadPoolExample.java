package com.practice.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample extends Thread {
    CachedThreadPoolExample(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Finished thread"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.execute(new CachedThreadPoolExample("1"));
        executorService.execute(new CachedThreadPoolExample("2"));
    }

}
