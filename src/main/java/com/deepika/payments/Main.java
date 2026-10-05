package com.deepika.payments;

import com.deepika.payments.check.AmountCheck;
import com.deepika.payments.check.Check;
import com.deepika.payments.model.Payment;
import com.deepika.payments.model.SepaInstantPayment;
import com.deepika.payments.model.SepaPayment;
import com.deepika.payments.model.SwiftPayment;

public class Main {
    public static void main(String[] args) {
        Check check = new AmountCheck(15000);

        Payment[] payments = {
                new SepaPayment("P1", 5000, "DE89370400440532013000", check),
                new SwiftPayment("P2", 10001, "DEUTDEFF", check),
                new SepaInstantPayment("P3", 3000, check),
                new SepaPayment("P4", 20000, "FR7630006000011234567890189", check)
        };

        for (Payment p : payments) {
            p.send();
            System.out.println(p.getId() + " -> " + p.getStatus());
        }
    }
}