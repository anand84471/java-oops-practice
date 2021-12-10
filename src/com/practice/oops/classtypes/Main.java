package com.practice.oops.classtypes;

public class Main {
    public static void main(String[] args) {
        StaticClassOuterExample.StaticClassExample.name="Anand";
        System.out.println(StaticClassOuterExample.StaticClassExample.name);

        //Private constructor test
        //PrivateConstructor obj=new PrivateConstructor();// error can not create an instance as constructor is private

    }
}
