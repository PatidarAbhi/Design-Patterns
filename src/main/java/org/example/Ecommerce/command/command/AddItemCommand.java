package org.example.Ecommerce.command.command;

import org.example.Ecommerce.command.decorator.Product;

public class AddItemCommand implements CheckoutCommand {

    private final Cart cart;
    private final Product item;

    public AddItemCommand(Cart cart, Product item) {
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        cart.addItem(item);
    }

}
