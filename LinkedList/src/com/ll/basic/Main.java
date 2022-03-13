package com.ll.basic;

public class Main {

    public static void main(String[] args) throws Exception {

        CustomLinkedList ll = new CustomLinkedList();
        ll.insertFirst(10);
        ll.insertFirst(9);
        ll.insertFirst(8);

        ll.insertLast(11);
//        System.out.println(ll.deleteFirst());

      //  System.out.println(ll.deleteLast());

        ll.add(11, 3);
        ll.add(12, 4);
        ll.delete(3);

        ll.display();
        System.out.println();
        System.out.println("Size ===> " + ll.getSize());


    }

}
