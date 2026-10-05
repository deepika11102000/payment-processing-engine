package com.deepika.payments.model;

import com.deepika.payments.check.Check;

public class SwiftPayment extends Payment {
    private final String bic;

    public SwiftPayment(String id, double amount, String bic, Check check){
        super(id, amount, check);
        this.bic = bic;
    }

    @Override
    protected void doSend() {
        System.out.println("Sending " + getId() + " via SWIFT to " + bic + ": " + getAmount());
    }
}