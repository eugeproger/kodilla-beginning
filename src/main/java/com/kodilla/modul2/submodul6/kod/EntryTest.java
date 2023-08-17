package com.kodilla.modul2.submodul6.kod;

import java.util.HashMap;
import java.util.Map;

public class EntryTest {
    public static void main(String[] args) {
        Map<Integer, String> theMap = new HashMap<>();
        theMap.put(1, "One");
        theMap.put(2, "Two");
        theMap.put(7, "Seven");

        for (Map.Entry<Integer, String> entry: theMap.entrySet()) {
            System.out.println("Object: <" + entry.getKey() + ", " + entry.getValue() + ">");
        }
    }
}
