package com.practice.oops.classtypes;

public class StaticClassOuterExample {
    public static class StaticClassExample{
        //public String name; not allowed
        public static String name;
        private static String address; //accessible to only the outer class and inside methods
    }
    public static void main(String[] args) {
        StaticClassExample.name="Anand Kumar";
        StaticClassExample.address="Noida";
        System.out.println(StaticClassExample.name);
    }

}
