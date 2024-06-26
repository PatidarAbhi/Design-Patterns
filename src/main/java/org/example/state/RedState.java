package org.example.state;


public class RedState  implements  State{

    @Override
    public void next(TrafficLight context) {
        context.setState(new GreenState());
    }

    @Override
    public void printStatus() {
        System.out.println("Traffic light is Red.");
    }

}
