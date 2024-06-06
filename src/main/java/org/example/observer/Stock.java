package org.example.observer;

public class Stock extends Subject{

    private final String stockName;
    private double stockPrice;

    public Stock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }



    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyAllObserver(stockName ,stockPrice);
    }

    public String getStockName() {
        return stockName;
    }

    public double getStockPrice() {
        return stockPrice;
    }
}
