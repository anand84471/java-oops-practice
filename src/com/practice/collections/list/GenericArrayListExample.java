package com.practice.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayListExample {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add("Anand");
        for (Object obj:list) {
            System.out.println(obj);
        }
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
