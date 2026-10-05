package com.deepika.payments.model;

public abstract class Payment {
    private final String id;
    private final double amount;
    private PaymentStatus status = PaymentStatus.CREATED;

    protected Payment(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public void send() {
        doSend();
        status = PaymentStatus.SENT;
    }

    protected abstract void doSend();

    public String getId() { return id; }
    public double getAmount() { return amount; }
    public PaymentStatus getStatus() { return status; }
}