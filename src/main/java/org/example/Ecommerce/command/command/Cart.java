package org.example.Ecommerce.command.command;

import org.example.Ecommerce.command.decorator.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Product> items;
    private double total;

    public Cart() {
        this.items = new ArrayList<>();
        this.total = 0.0;
    }

    public void addItem(Product item) {
        items.add(item);
        total += item.getCost();
        System.out.println("Item added: " + item + ", Price: " + item.getCost() + ", New total: " + total);
    }

    public void applyDiscount(double discount) {
        total -= discount;
        System.out.println("Discount applied: " + discount + ", New total: " + total);
    }

    public void removeItem(Product item) {
        if (items.remove(item)) {
            total -= item.getCost();
            System.out.println("Item removed: " + item + ", Price: " + item.getCost() + ", New total: " + total);
        } else {
            System.out.println("Item not found: " + item);
        }
    }
}
