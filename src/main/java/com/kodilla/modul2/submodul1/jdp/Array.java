package com.kodilla.modul2.submodul1.jdp;

import java.util.Random;

public class Array {

    public int[] createRandom(int size, int numberMax) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(numberMax);
        }
        return array;
    }

    public int[] createEmpty(int size) {
        int[] array = new int[size];
        return array;
    }
}
