package org.example.state;

public interface State {

    void next(TrafficLight trafficLight);
    void printStatus();
}
