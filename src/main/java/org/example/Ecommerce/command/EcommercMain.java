package org.example.Ecommerce.command;

import org.example.Ecommerce.command.adapter.GPay;
import org.example.Ecommerce.command.adapter.PaymentAdapter;
import org.example.Ecommerce.command.adapter.PaymentProvider;
import org.example.Ecommerce.command.adapter.PhonePay;
import org.example.Ecommerce.command.command.*;
import org.example.Ecommerce.command.decorator.BasicProduct;
import org.example.Ecommerce.command.decorator.GiftWrapDecorator;
import org.example.Ecommerce.command.decorator.Product;
import org.example.Ecommerce.command.decorator.WarrantyDecorator;
import org.example.Ecommerce.command.strategy.ShippingStrategy;
import org.example.Ecommerce.command.strategy.StandardShippingStrategy;

public class EcommercMain {
public static void shopping(){

    Cart cart = new Cart();

    Product laptop= new BasicProduct("Laptop" , 10000.00);
    Product book  = new BasicProduct("Book", 20.00);


    //Decorate
    Product laptopDecorate = new GiftWrapDecorator(new WarrantyDecorator(laptop));

    //add in cart
    CheckoutCommand addLaptop = new AddItemCommand(cart,laptopDecorate);
    CheckoutCommand addBook = new AddItemCommand(cart ,book);

    Checkout invoker = new Checkout();
    invoker.setCommand(addLaptop);
    invoker.process();

    invoker.setCommand(addBook);
    invoker.process();

    CheckoutCommand removeBook = new RemoveItemCommand(cart , book);
    invoker.setCommand(removeBook);
    invoker.process();

    //applying discount
    CheckoutCommand applyDiscount = new ApplyDiscountCommand(cart , 1000.00);
    invoker.setCommand(applyDiscount);
    invoker.process();

    //here we can interchange shipping strategy
    ShippingStrategy standardShipping = new StandardShippingStrategy();
    double shippingCost = standardShipping.calculateShippingCost(2.5);
    System.out.println("Shipping Cost: $" + shippingCost);

    //adapter pattern
    PaymentProvider gPay = new GPay();
    PaymentProvider phonePay = new PhonePay();

    PaymentAdapter payWithGpay = new PaymentAdapter(gPay);
    payWithGpay.pay();

    PaymentAdapter payWithPhonePay = new PaymentAdapter(phonePay);
    payWithGpay.pay();





}


}
