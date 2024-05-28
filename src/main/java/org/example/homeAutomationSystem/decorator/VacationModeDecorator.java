package org.example.homeAutomationSystem.decorator;

import org.example.homeAutomationSystem.command.SmartDevice;

public class VacationModeDecorator extends DeviceDecorator {

    public VacationModeDecorator(SmartDevice smartDevice) {
        super(smartDevice);
    }

    @Override
    public void on() {
        smartDevice.on();
        System.out.println("Vacation mode activated.");
    }

    @Override
    public void off() {
        smartDevice.off();
    }
}
