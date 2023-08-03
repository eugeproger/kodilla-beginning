package com.kodilla.modul1.submodul4.jdp;

abstract class Bank {

    private String getInfoAcceptanceWithdrawRequest() {
        return "A withdrawal request is acceptance";
    }

    private void checkBalance() {
        System.out.println("Checking your account balance...");
    }

    private String getConfirmationWithdrawal() {
        return "You can withdraw your money";
    }

    abstract protected void askForInputtingCard();
    abstract protected void askForEnteringPIN();
    abstract protected void askForEnteringAmountToBePaid();
    abstract protected void withdrawCash();
    abstract protected void sayThanksForUsingBankService();

    public void start() {
        this.askForInputtingCard();
        this.askForEnteringPIN();
        this.askForEnteringAmountToBePaid();

        String infoAcceptanceWithdrawRequest = this.getInfoAcceptanceWithdrawRequest();
        System.out.println(infoAcceptanceWithdrawRequest);

        this.checkBalance();

        String conformationPossibilityWithdraw = this.getConfirmationWithdrawal();
        System.out.println(conformationPossibilityWithdraw);

        this.withdrawCash();
        this.sayThanksForUsingBankService();
    }
}
