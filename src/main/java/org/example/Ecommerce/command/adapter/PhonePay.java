package org.example.Ecommerce.command.adapter;

public class PhonePay implements PaymentProvider{
    @Override
    public void pay() {
        System.out.println("Paying with the phonePay ");
    }
}
