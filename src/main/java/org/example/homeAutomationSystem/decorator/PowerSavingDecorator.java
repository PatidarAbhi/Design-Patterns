package org.example.homeAutomationSystem.decorator;

import org.example.homeAutomationSystem.command.SmartDevice;

public class PowerSavingDecorator extends DeviceDecorator {

    public PowerSavingDecorator(SmartDevice smartDevice) {
        super(smartDevice);
    }

    @Override
    public void on() {
        smartDevice.on();
        System.out.println("Power-saving mode activated.");
    }

    @Override
    public void off() {
        smartDevice.off();
    }
}
