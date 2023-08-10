package com.kodilla.modul2.submodul5.kod;

import java.util.ArrayList;

public class ArrayListTest {

    static void space() {
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ArrayList<String> library = new ArrayList<>();

        library.add("50 Shades of Grey");
        library.add("Sherlock Holmes");
        library.add("The Last of the Mohicans");
        library.add("Better Call Saul");
        library.add("Journey to the Center of the Earth");
        library.add("Binary Death");
        library.add("Braking Bad");
        library.add("Twenty Thousand Leagues Under the Sea");
        library.add("The Titan fall");
        library.add("Coma");
        library.add("Of Ants and Men");
        library.add("To Understand a Woman");
        library.add("Never ending Story");
        library.add("The Jungle Book");

        System.out.println("Quality of elements " + library.size());

        space();

        for (int n = 0; n < library.size(); n++) {
            System.out.println("Element " + n + " of the library is: " + library.get(n));
        }

        space();

        for (String book: library) {
            System.out.println("Element of the library is: " + book);
        }

        space();

        System.out.println("Removing last object from collection...");
        library.remove(library.size()-1);

        System.out.println("Collection contains: ");
        for (String book: library) {
            System.out.println("Element of the library is: " + book);
        }

        space();

        library.add(0, "Metro 2020");
        System.out.println("Adding object on the top collection...");
        System.out.println("Collection contains: ");
        for (String book: library) {
            System.out.println("Element of the library is: " + book);
        }
    }
}
