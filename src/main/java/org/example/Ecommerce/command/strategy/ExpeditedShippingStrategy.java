package org.example.Ecommerce.command.strategy;

public class ExpeditedShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return 5.0 * weight;
    }
}
