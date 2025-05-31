package com.bridgelabz.stackqueue;

public class Node<E> {
    //Node creation with data and next pointing towards the next address
    E data;
    Node<E> next;
    public Node(E data){
        this.data = data;
        this.next = null;
    }
}
