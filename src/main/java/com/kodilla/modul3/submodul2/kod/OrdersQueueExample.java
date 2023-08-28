package com.kodilla.modul3.submodul2.kod;

import java.util.ArrayDeque;
import java.util.Deque;

public class OrdersQueueExample {

    public static void main(String[] args) {
        Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
        Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
        Book theBook3 = new Book("50 shades of gray = lexicon for graphicians", "Dante Alighieri", 1572);

        Order theOrder1 = new Order(theBook1, 2017, 6, 28);
        Order theOrder2 = new Order(theBook2, 2017, 6, 28);
        Order theOrder3 = new Order(theBook1, 2017, 6, 29);
        Order theOrder4 = new Order(theBook2, 2017, 6, 30);
        Order theOrder5 = new Order(theBook3, 2017, 6, 30);

        Deque<Order> theOrders = new ArrayDeque<>();
        System.out.println("Queue is created. It's size: " + theOrders.size());

        theOrders.offer(theOrder1);
        theOrders.offer(theOrder2);
        theOrders.offer(theOrder3);
        theOrders.offer(theOrder4);
        theOrders.offer(theOrder5);

        System.out.println("Queue is filled. It's size: " + theOrders.size());
        System.out.println(" ");

        //Examine the order at beginning of the queue
        System.out.println("First order in the queue is: \n" + theOrders.peek());
        System.out.println(" ");

        //Get objects from queue
        Order temporaryOrder;
        temporaryOrder = theOrders.poll();
        //here you can do something with order taken from the queue
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();

        System.out.println("Queue is emptied. It's size: " + theOrders.size());
        System.out.println(" ");

        System.out.println("Last order taken from queue was:\n" + temporaryOrder);
    }
}
