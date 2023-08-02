package com.kodilla.modul1.submodul3.jdp;

public class App {
    public static void main(String[] args) {
        Knight knight = new Knight();
        Quest quest1 = new DeadIslandQuest();
        Quest quest2 = new EliteKnightQuest();
        knight.fight(quest2);
    }
}
