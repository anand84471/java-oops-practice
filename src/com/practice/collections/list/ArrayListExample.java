package com.practice.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        //adding a new element
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);
        //iterations using iterator
        Iterator itr=arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //using for loop
        for (Integer nums:arrayList) {
            System.out.println(nums);
        }
        //indexing
        System.out.println(arrayList.get(0));
        //setting the value
        System.out.println(arrayList.set(1,9));
        System.out.println(arrayList.get(1));
        //sorting the list
        Collections.sort(arrayList);
        System.out.println(arrayList);
        //removing the element
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.remove(new Integer(4));
        System.out.println(arrayList);
        //getting the size
        System.out.println(arrayList.size());
        //checking the list is empty
        System.out.println(arrayList.isEmpty());
        //reversing
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
