package com.bridgelabz.stack;

public class StackMainClass {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.size());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
//        int size = stack.size();
//        System.out.println(size);
//        boolean isEmpty = stack.isEmpty();
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
        stack.displayStack();
//        System.out.println(stack.pop());


    }
}
