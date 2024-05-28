package org.example.homeAutomationSystem.command;

import org.example.homeAutomationSystem.strategy.TemperatureControl;

public class AirConditioner implements SmartDevice {

    private TemperatureControl temperatureControl;

    public void setTemperatureControl(TemperatureControl temperatureControl) {
        this.temperatureControl = temperatureControl;
    }

    public void regulateTemperature() {
        if (temperatureControl != null) {
            temperatureControl.regulateTemperature();
        } else {
            System.out.println("No temperature control strategy set.");
        }
    }

    @Override
    public void on() {
        System.out.println("Air Conditioner is ON");
    }

    @Override
    public void off() {
        System.out.println("Air Conditioner is OFF");
    }
}
