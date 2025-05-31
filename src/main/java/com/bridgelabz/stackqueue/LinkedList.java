package com.bridgelabz.stackqueue;

//Creating a stack using a linked list
public class LinkedList<E> {
    //creating a head Node
    Node<E> head;

    //method to add the data to the top
    public boolean add(E data){
        Node<E> newNode = new Node<E>(data);
        Node<E> temp = head;
        this.head = newNode;
        newNode.next = temp;
        return true;
    }
    //Overriding the toString method to print the stack
    @Override
    public String toString() {
        //condition to check if the head is null
        if(head==null)
            return "";
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
        return "";
    }


}
