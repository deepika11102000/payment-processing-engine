package com.deepika.payments.check;

import com.deepika.payments.model.Payment;

public interface Check {
    boolean isSuspicious(Payment payment);
}
