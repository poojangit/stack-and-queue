package com.bridgelabz.stackqueue;

public class MainClass {
    public static void main(String[] args) {
        // Create a stack object
        Stack stack = new Stack();
        // calling a push method to add the data into the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.pop();
        System.out.println(stack.peek());
        System.out.print(stack.list);

        Queue queue = new Queue();
        queue.enqueue(57);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println(queue);
    }


}
