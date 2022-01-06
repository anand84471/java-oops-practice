package com.practice.multithreading.synchronizationstudy;

public class SyncExample extends Thread{
    Table t;
    SyncExample(Table t){
        this.t=t;
    }
    @Override
    public void run() {
        super.run();
        t.printTable(5);
    }


    public static void main(String[] args) {
        Table table=new Table();
        SyncExample t1=new SyncExample(table);
        SyncExample t2=new SyncExample(table);
        t1.start();
        t2.start();
    }
}
