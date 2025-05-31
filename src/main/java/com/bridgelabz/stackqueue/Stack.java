package com.bridgelabz.stackqueue;

public class Stack<E> {
    //Creating a linked list object
    LinkedList<E> list = new LinkedList<>();
    //push method internally call add method on linked list
    public boolean push(E data){
        Node<E> newNode = new Node<E>(data);
        return list.add(data);
    }
    public String toString(){
        return list.toString();
    }
}
