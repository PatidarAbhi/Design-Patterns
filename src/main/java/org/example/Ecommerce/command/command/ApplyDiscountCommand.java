package org.example.Ecommerce.command.command;

public class ApplyDiscountCommand implements CheckoutCommand {
    private final Cart cart;
    private final double discount;

    public ApplyDiscountCommand(Cart cart, double discount) {
        this.cart = cart;
        this.discount = discount;
    }

    @Override
    public void execute() {
        cart.applyDiscount(discount);
    }
}
