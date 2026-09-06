package model;

public abstract class Payment {

    double amount;

    Payment(double amount){
        this.amount = amount;
    }

    public abstract void processPayment();

}
