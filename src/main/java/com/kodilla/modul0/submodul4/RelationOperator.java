package com.kodilla.modul0.submodul4;

public class RelationOperator {
    public static void main(String[] args) {
        String name = "Krzysiek";
        String name2 = "Janek";
        int age = 11;

        if (name == "Krzysiek") {
            System.out.println("On ma na imię " + name + " to pewne!");
        }
        if (name != "Janek") {
            System.out.println("On na pewno nie ma na imię Janek, tylko " + name + " to pewne!!!");
        }
        if (age > 10) {
            System.out.println("Janek na pewno ma więcej niż 10 lat");
        }
        if (age >= 11) {
            System.out.println("Janek na pewno ma 11 lat lub więcej");
        }
        if (age < 12) {
            System.out.println("Janek na pewno ma mniej niż 12 lat");
        }
        if (age <= 11) {
            System.out.println("Janek na pewno ma mniej lub dokładnie 11 lat");
        }
    }
}
