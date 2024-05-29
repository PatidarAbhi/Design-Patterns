package org.example.Ecommerce.command.adapter;

public class PaymentAdapter implements Payment {

    PaymentProvider paymentProvider;

    public PaymentAdapter(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    @Override
    public void pay() {
        paymentProvider.pay();
    }
}
