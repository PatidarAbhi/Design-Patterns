package org.example.Ecommerce.command.strategy;

public class StandardShippingStrategy implements  ShippingStrategy{
    @Override
    public double calculateShippingCost(double weight) {
        return 2.0 * weight;
    }
}
