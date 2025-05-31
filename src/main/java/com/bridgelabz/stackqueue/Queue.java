package com.bridgelabz.stackqueue;

public class Queue<E> {
    LinkedList<E> list = new LinkedList<E>();
    public boolean enqueue(E data){
        return list.apppend(data);
    }
    //method to remove the data from the beginning
    public E dequeue(){
        return list.remove();
    }
    public String toString(){
        return list.toString();
    }
}
