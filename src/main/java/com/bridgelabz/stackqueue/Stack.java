package com.bridgelabz.stackqueue;

public class Stack<E> {
    //Creating a linked list object
    LinkedList<E> list = new LinkedList<>();
    //push method internally calls add method from the linked list
    public boolean push(E data){
        Node<E> newNode = new Node<E>(data);
        return list.add(data);
    }
    //pop method internally calls remove method from the linked list
    public void pop(){
        list.remove();
    }
    //peek method interally calls view method from the linked list
    public E peek(){
        return list.view();
    }
    public String toString(){
        return list.toString();
    }
}
