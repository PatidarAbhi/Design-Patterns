package org.example.homeAutomationSystem.strategy;

public class QuickCoolTemperatureControl implements TemperatureControl {
    @Override
    public void regulateTemperature() {
        System.out.println("Regulating temperature using quick-cool strategy.");
    }
}
