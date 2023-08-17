package com.kodilla.modul2.submodul6.kod;

public class MyKey {

    int value;

    public MyKey(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        if (value >= 0 && value <= 9) {
            return 0;
        }
        if (value >= 10 && value <= 19) {
            return 1;
        }
        if (value >= 20 && value <= 29) {
            return 2;
        } else {
            return 3;
        }
    }
}
