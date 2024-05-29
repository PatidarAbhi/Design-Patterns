package org.example.Ecommerce.command.decorator;

public abstract class ProductDecorator implements Product {

    protected Product decoratedProduct;

    public ProductDecorator(Product decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }

    @Override
    public String getDescription() {
        return decoratedProduct.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedProduct.getCost();
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
