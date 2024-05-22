package org.example.state;

public class TrafficLight {

    private State state;

    public TrafficLight() {
        this.state = new RedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
