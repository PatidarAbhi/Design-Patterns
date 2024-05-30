package org.example.observer;

public class StcokMarket {

    public static void observer()
    {
        Stock innogentStock = new Stock("Innogent" , 150.00);

        Investor investor1 = new Investor("Abhishek");
        Investor investor2 = new Investor("Kartik");

        innogentStock.attach(investor1);
        innogentStock.attach(investor2);

        innogentStock.setStockPrice(1555.00);
        innogentStock.setStockPrice(150.00);

        innogentStock.detach(investor1);

        innogentStock.setStockPrice(250.00);
    }
}
