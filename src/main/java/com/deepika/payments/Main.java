package com.deepika.payments;

import com.deepika.payments.model.Payment;
import com.deepika.payments.model.SepaInstantPayment;
import com.deepika.payments.model.SepaPayment;
import com.deepika.payments.model.SwiftPayment;

public class Main {
    public static void main(String[] args) {
        Payment[] payments = {
            new SepaPayment("P1", 5000, "DE89370400440532013000"),
            new SwiftPayment("P2", 10001, "DEUTDEFF"),
            new SepaInstantPayment("P3",3000)
        };

        for (Payment p : payments) {
            p.send();
            System.out.println(p.getId() + " -> " + p.getStatus());
        }
    }
}