package org.example.Ecommerce.command.strategy;

public class InternationalShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return 10.0 * weight;
    }
}
