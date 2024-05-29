package org.example.Ecommerce.command.strategy;

public class ShippingCalculator {
    private ShippingStrategy shippingStrategy;

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingCost(double weight) {
        return shippingStrategy.calculateShippingCost(weight);
    }
}