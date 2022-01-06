package com.practice.collections.list;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Anand");
        vector.add("Ajay");
        vector.add("Anuj");
        System.out.println(vector);
        //Creating vector with specifying initial size
        Vector<String> vector1=new Vector<>(10);
        System.out.println("The size is"+vector1.size());
        System.out.println("The capacity is "+vector1.capacity());
    }
}
