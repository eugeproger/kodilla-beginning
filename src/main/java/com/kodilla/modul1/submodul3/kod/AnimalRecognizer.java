package com.kodilla.modul1.submodul3.kod;

public class AnimalRecognizer {

    public String recognize(Animal animal) {
        return "I am sure that this is: " + animal.name() + " and sounds like: " + animal.voice();
    }
}
