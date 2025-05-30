package com.bridgelabz.stack;

import java.util.EmptyStackException;

//class stack
public class Stack {
    Node top;
    int size;

    //method to push the data to the top
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    //method to remove the data from the top
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        size--;
        return result;
    }
    //method to view the data fom the top
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    //method to check if the stack is empty
    public boolean isEmpty(){
        if(size != 0){
            return false;
        }
        return true;
    }
    //method to return the size of the stack
    public int size(){
        return size;
    }
    //method to display the stack list
    public void displayStack() {
        Node current = top;
        while(current!=null){
            System.out.print(current.data + "---> ");
            current = current.next;
        }
        System.out.print("Null");
    }
}
