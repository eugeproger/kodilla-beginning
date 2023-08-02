package com.kodilla.modul1.submodul3.kod;

public class App {
    public static void main(String[] args) {
        AnimalRecognizer recognizer = new AnimalRecognizer();
        String recognizedAnimal = recognizer.recognize(new Cat());

        System.out.println(recognizedAnimal);
    }
}
