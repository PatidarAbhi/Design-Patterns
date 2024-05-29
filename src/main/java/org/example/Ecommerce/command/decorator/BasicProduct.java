package org.example.Ecommerce.command.decorator;

public class BasicProduct implements Product {

    private final String description;
    private final double cost;

    public BasicProduct(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
