package com.deepika.payments.model;

public class SepaPayment extends Payment {
    private final String iban;

    public SepaPayment(String id, double amount, String iban) {
        super(id, amount);
        this.iban = iban;
    }

    @Override
    protected void doSend() {
        System.out.println("Sending " + getId() + " via SEPA to " + iban + ": " + getAmount());
    }
}