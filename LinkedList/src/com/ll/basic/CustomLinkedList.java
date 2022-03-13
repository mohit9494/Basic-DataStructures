package com.ll.basic;

public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public int getSize() {
        return this.size;
    }

    public void insertLast(int value) {

        Node nn = new Node(value);
        tail.next = nn;
        tail = nn;

        size++;
    }

    public void add(int value, int index) throws Exception {

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        if (index > size) throw new Exception("Please enter index <= " + getSize());

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node previous = temp;
        Node next = temp.next;

        Node nn = new Node(value);
        previous.next = nn;
        nn.next = next;

        size++;
    }

    public int deleteFirst() {
        int value = head.value;

        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast() {
        if (getSize() == 1) {
            return deleteFirst();
        }

        int value = tail.value;

        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return value;
    }

    public int delete(int index) throws Exception {

        if (index == 0) return deleteFirst();
        if (index == size - 1) return deleteLast();

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node previous = temp;
        Node next = temp.next.next;
        int value = temp.next.value;

        previous.next = next;

        size--;
        return value;

    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.print("END");
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
