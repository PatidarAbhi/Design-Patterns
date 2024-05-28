package org.example.homeAutomationSystem.decorator;

import org.example.homeAutomationSystem.command.SmartDevice;

public abstract class DeviceDecorator implements SmartDevice {

    protected SmartDevice smartDevice;

    public DeviceDecorator(SmartDevice smartDevice) {
        this.smartDevice = smartDevice;
    }


}
