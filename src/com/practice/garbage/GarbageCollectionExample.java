package com.practice.garbage;

public class GarbageCollectionExample {
    //it is deprecated
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {
        GarbageCollectionExample obj1=new GarbageCollectionExample();
        GarbageCollectionExample obj2=new GarbageCollectionExample();
        obj1=null;
        obj2=null;
        System.gc();
    }
}
