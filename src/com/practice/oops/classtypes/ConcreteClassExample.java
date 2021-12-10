package com.practice.oops.classtypes;

public class ConcreteClassExample {
    public String name;

    public String getName() {
        return name;
    }
    public void setName(String newName){
        name=newName;
    }
    //
    public static void main(String[] args){
        ConcreteClassExample concreteClassExample=new ConcreteClassExample();
        concreteClassExample.name="Anand";
        System.out.println(concreteClassExample.name);
    }
}