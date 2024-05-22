package org.example.state;

public class GreenState implements State{
    @Override
    public void next(TrafficLight context) {
      context.setState(new YellowState());
    }

    @Override
    public void printStatus() {
        System.out.println("Traffic light is Green.");
    }
}
