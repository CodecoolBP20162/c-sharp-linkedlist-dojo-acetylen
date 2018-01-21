package com.codecool;

import java.util.StringJoiner;

public class LinkedListDojo {

    private Node head;
    private Node tail;
    private int size;

    public void append(int data){

        Node tmp = new Node(data, null, tail);
        if(tail != null) {tail.setNext(tmp);}
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
    }

    public void prepend(int data){
        Node tmp = new Node(data, head, null);

        if(head != null ){
            head.setPrev(tmp);
        }
        head = tmp;
        if(tail == null) { tail = tmp;}
        size++;
    }

    public void remove(int data) {
        if(head==null)
            return;
        if(head.getData() == data) {
            head = head.getNext();
            size--;
        }
        if(tail.getData() == data) {
            tail = tail.getPrev();
            size--;
        }

        Node current = head;
        while(current.hasNext()){
            if(current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    public int getSize(){
        return size;
    }


    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ");
        Node current = head;
            while(current!=null){
                sj.add(current.toString());
                current = current.getNext();
            }

        return sj.toString();
    }

    public int get(int index) {
        int i = 0;
        Node current = head;
        while(current!=null){
            i++;
            current = current.getNext();
            if(i==index) {
                return current.getData();
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int getFromTail(int index) {
        int i = size-1;
        Node current = tail;
        while(current!=null){
            i--;
            current = current.getPrev();
            if(i==index) {
                return current.getData();
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}

