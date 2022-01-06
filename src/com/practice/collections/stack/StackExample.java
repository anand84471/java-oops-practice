package com.practice.collections.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //generic stack
        Stack stack=new Stack();
        stack.push("Anand");
        stack.push(1);
        Object last=stack.peek();
        System.out.println(stack);
        System.out.println(last);
        System.out.println();
        //stack
        Stack<Integer> numbers=new Stack<Integer>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(4);
        numbers.push(4);
        numbers.push(4);
        numbers.push(4);
        numbers.push(4);
        numbers.push(4);
        numbers.push(4);
        numbers.push(4);
        numbers.push(4);
        numbers.pop();
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.capacity());
    }
}
