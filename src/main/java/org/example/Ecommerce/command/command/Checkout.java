package org.example.Ecommerce.command.command;

public class Checkout {

    private CheckoutCommand command;

    public void setCommand(CheckoutCommand command) {
        this.command = command;
    }

    public void process() {
        command.execute();
    }
}
