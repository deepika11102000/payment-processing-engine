package com.deepika.payments.model;

public class SwiftPayment extends Payment {
    private final String bic;

    public SwiftPayment(String id, double amount, String bic){
        super(id, amount);
        this.bic = bic;
    }

    @Override
    protected void doSend() {
        System.out.println("Sending " + getId() + " via SWIFT to " + bic + ": " + getAmount());
    }
}