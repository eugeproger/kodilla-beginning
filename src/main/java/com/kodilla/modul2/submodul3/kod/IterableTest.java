package com.kodilla.modul2.submodul3.kod;

import java.util.ArrayList;

public class IterableTest {

    public static void main(String[] args) {
        ArrayList<String> theList = new ArrayList<String>();
        theList.add("object 1");
        theList.add("object 2");
        theList.add("object 3");
        theList.add("object 4");
        theList.add("object 5");

        for (String theObject: theList) {
            System.out.println(theObject);
        }
    }
}
