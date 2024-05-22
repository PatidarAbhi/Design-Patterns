package org.example.decorator;

public class DecoratorMain {

    public  static void orderCoffee()
    {
        Coffee coffee = new  SimpleCoffee();
        coffee= new MilkDecorator(new SugarDecorator(new MilkDecorator(coffee)));
        System.out.println(coffee.getDescription());
    }
}
