package com.practice.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //Implementiong a stack
        list.push(2);
        list.push(4);
        list.pop();
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
    }
}
