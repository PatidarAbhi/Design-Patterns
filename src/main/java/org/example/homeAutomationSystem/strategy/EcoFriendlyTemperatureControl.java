package org.example.homeAutomationSystem.strategy;

public class EcoFriendlyTemperatureControl implements TemperatureControl {
    @Override
    public void regulateTemperature() {
        System.out.println("Regulating temperature using eco-friendly strategy.");
    }
}
