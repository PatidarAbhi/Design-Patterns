package org.example.state;

public class StateMain {

    public static void  getStates()
    {
        TrafficLight trafficLight =new TrafficLight();

        trafficLight.printStatus();
        trafficLight.next();
        trafficLight.printStatus();
        trafficLight.next();
        trafficLight.printStatus();
        trafficLight.next();
        trafficLight.printStatus();

    }
}
