package org.example.Ecommerce.command.command;

import org.example.Ecommerce.command.command.Cart;
import org.example.Ecommerce.command.command.CheckoutCommand;
import org.example.Ecommerce.command.decorator.Product;

public class RemoveItemCommand implements CheckoutCommand {
    private final Cart cart;
    private final Product item;

    public RemoveItemCommand(Cart cart, Product item) {
        this.cart = cart;
        this.item = item;
    }

    @Override
    public void execute() {
        cart.removeItem(item);
    }
}
