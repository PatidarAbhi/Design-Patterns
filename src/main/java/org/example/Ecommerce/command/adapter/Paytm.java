package org.example.Ecommerce.command.adapter;

public class Paytm implements PaymentProvider{
    @Override
    public void pay() {
        System.out.println("Paying with the paytm ");
    }
}
