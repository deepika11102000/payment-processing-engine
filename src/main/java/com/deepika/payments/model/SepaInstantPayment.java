package com.deepika.payments.model;

import com.deepika.payments.check.Check;

public class SepaInstantPayment extends Payment {
    public SepaInstantPayment(String id, double amount, Check check) {
        super(id, amount, check);
    }

    @Override
    protected void doSend() {
        System.out.println("Sending " + getId() + " via SEPA INSTANT : " + getAmount());
    }
}
