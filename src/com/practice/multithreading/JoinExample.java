package com.practice.multithreading;

public class JoinExample extends Thread{
    @Override
    public void run() {
        for (var i=0;i<5;i++){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        super.run();
    }



    public static void main(String[] args) {
        JoinExample t1=new JoinExample();
        t1.start();
        try{
            t1.join();
        }
        catch (InterruptedException ex){
            System.out.println(ex.getStackTrace());
        }
        finally {
            JoinExample t2=new JoinExample();
            t2.start();
        }
    }
}
