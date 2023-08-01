package com.kodilla.modul1.submodul2.kod.shape;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDrawer shapeDrawer = new ShapeDrawer(circle);
        shapeDrawer.process();
    }
}
