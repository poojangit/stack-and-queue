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
    //method to delete the node from the top
    public E remove(){
        Node<E> temp = head;
        //condition to check if the head is null
        if(head == null){
            throw new RuntimeException("Stack is empty");
        }
        head = head.next;
        return temp.data;
    }

    //method to view the node from the top
    public E view(){
        //condition to check if the head is empty
        if(head == null){
            throw new RuntimeException("Stack is empty");
        }
        return head.data;
    }
    //
    public boolean apppend(E data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
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
