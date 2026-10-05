package com.deepika.payments.check;

import com.deepika.payments.model.Payment;

public class AmountCheck implements Check{
    private final double limit;

    public AmountCheck(double limit){
        this.limit=limit;
    }

    @Override
    public boolean isSuspicious(Payment payment) {
        return payment.getAmount() > limit;
    }
}
