package com.kodilla.modul1.submodul4.jdp;

public class ATM extends Bank{
    @Override
    protected void askForInputtingCard() {
        System.out.println("Please, input your bank card");
    }

    @Override
    protected void askForEnteringPIN() {
        System.out.println("Please, enter code PIN for your card");
    }

    @Override
    protected void askForEnteringAmountToBePaid() {
        System.out.println("Please, enter amount to be paid");
    }

    @Override
    protected void withdrawCash() {
        System.out.println("Withdrawing cash...");
    }

    @Override
    protected void sayThanksForUsingBankService() {
        System.out.println("Thank you for using are service. Have a nice day!");
    }
}
