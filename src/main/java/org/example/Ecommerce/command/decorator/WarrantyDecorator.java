package org.example.Ecommerce.command.decorator;

public class WarrantyDecorator extends ProductDecorator{
    public WarrantyDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public String getDescription() {
        return decoratedProduct.getDescription() + ", with extended warranty";
    }

    @Override
    public double getCost() {
        return decoratedProduct.getCost() + 20.0;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
