package com.kodilla.modul2.submodul3.kod;
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class IterableTest {
    public static void main (String[] args) throws java.lang.Exception {
        //Creating ArrayList, which implements the Iterable interface and
        fill it
        ArrayList<String> theList = new ArrayList<String>();
        theList.add("object 1");
        theList.add("object 2");
        theList.add("object 3");
        theList.add("object 4");
        theList.add("object 5");
        //Displaying the list using Iterable interface and for-each loop
        for (String theObject: theList) {
            System.out.println(theObject);
        }
    }
}