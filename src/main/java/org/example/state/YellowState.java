package org.example.state;

public class YellowState implements State {
    @Override
    public void next(TrafficLight context) {
        context.setState(new RedState());

    }

    @Override
    public void printStatus() {
        System.out.println("Traffic light is Yellow.");
    }
}
