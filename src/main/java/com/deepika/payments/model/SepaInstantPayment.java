package com.deepika.payments.model;

public class SepaInstantPayment extends Payment {
    public SepaInstantPayment(String id, double amount) {
        super(id, amount);
    }

    @Override
    protected void doSend() {
        System.out.println("Sending " + getId() + " via SEPA INSTANT : " + getAmount());
    }
}
