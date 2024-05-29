package org.example.Ecommerce.command.decorator;

public class GiftWrapDecorator extends ProductDecorator{
    public GiftWrapDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public String getDescription() {
        return decoratedProduct.getDescription() + ", with gift wrap";
    }

    @Override
    public double getCost() {
        return decoratedProduct.getCost() + 5.0;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
