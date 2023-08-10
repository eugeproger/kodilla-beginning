package com.kodilla.modul2.submodul5.kod;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add(0, "Zero");
        list.add(1, "One");
        list.add(2, "Two");
        list.add(3, "Three");
        list.add(4, "Four");
        list.add(5, "Five");
        list.add(6, "Six");
        list.add(7, "Seven");
        list.add(8, "Eight");
        list.add(9, "Nine");
        list.add(10, "Ten");

        System.out.println("Element list(7) = " + list.get(7));

        List<Integer> theList = new LinkedList<>();
        for (int n = 0; n < 1000; n++) {
            theList.add(n*2);
        }

        System.out.println("List element at index 240 equals: " + theList.get(240));

        theList.add(240, 500);

        System.out.println("List element at index 240 equals: " + theList.get(240));
        System.out.println("List element at index 241 equals: " + theList.get(241));

        System.out.println("List size (after addition of 1 element equals: " + theList.size());

        theList.remove(240);

        System.out.println("List element at index 240 equals: " + theList.get(240));

        System.out.println("List size (after deletion of 1 element) equals: " + theList.size());

    }
}
