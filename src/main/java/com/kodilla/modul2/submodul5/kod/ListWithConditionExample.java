package com.kodilla.modul2.submodul5.kod;

import java.util.ArrayList;
import java.util.List;

public class ListWithConditionExample {

    public static void main(String[] args) {
        List<String> userNames = new ArrayList<>();
        userNames.add("Jennifer");
        userNames.add("Kimberly");
        userNames.add("Nicole");
        userNames.add("Amy");
        userNames.add("Sarah");
        userNames.add("Brandon");
        userNames.add("Robert");
        userNames.add("Ken");
        userNames.add("Jack");

        for (String name: userNames) {
            if (name.length() < 5) {
                System.out.println(name);
            }
        }
    }
}
