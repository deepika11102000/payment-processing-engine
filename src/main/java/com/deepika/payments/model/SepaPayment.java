package com.deepika.payments.model;

import com.deepika.payments.check.Check;

public class SepaPayment extends Payment {
    private final String iban;

    public SepaPayment(String id, double amount, String iban, Check check) {
        super(id, amount, check);
        this.iban = iban;
    }

    @Override
    protected void doSend() {
        System.out.println("Sending " + getId() + " via SEPA to " + iban + ": " + getAmount());
    }
}