package com.kodilla.modul1.submodul2.kod.telephone;

public class App {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.callTo("Adam");
        mobile.callToMom();
        System.out.println(Telephone.getMyNumber());
    }
}
