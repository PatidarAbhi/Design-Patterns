package org.example.homeAutomationSystem.command;

public class Light implements SmartDevice {
    @Override
    public void on() {
        System.out.println("Light is on");
    }

    @Override
    public void off() {
        System.out.println("Light is off");
    }
}
