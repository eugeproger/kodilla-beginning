package com.kodilla.modul3.submodul1.kod.localdate;

import java.time.LocalDate;

public class MyLocalDate {

    public static void main(String[] args) {
        LocalDate storedDay = LocalDate.of(2019, 2, 20);

        int year = storedDay.getYear();
        int month = storedDay.getMonthValue();
        int day = storedDay.getDayOfMonth();
    }
}
