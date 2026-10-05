package com.deepika.payments.model;

import com.deepika.payments.check.Check;

public abstract class Payment {
    private final String id;
    private final double amount;

    private final Check check;

    private PaymentStatus status = PaymentStatus.CREATED;

    protected Payment(String id, double amount, Check check) {
        this.id = id;
        this.amount = amount;
        this.check = check;
    }

    public void send() {
        if(check.isSuspicious(this)){
            status = PaymentStatus.BLOCKED;
            System.out.println(id + "FraudCheck blocked");
            return;
        }
        doSend();
        status = PaymentStatus.SENT;
    }

    protected abstract void doSend();

    public String getId() { return id; }
    public double getAmount() { return amount; }
    public PaymentStatus getStatus() { return status; }
}