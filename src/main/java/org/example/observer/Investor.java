package org.example.observer;

public class Investor implements   Observer{
    private String investorName;

    public Investor(String investorName) {
        this.investorName = investorName;
    }
    @Override
    public void update(String subjectName, Object newState) {
        System.out.println("Investor " + investorName + " notified. " + subjectName + " is now " + newState);
    }
}
