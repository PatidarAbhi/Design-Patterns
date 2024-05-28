package org.example.homeAutomationSystem.command;

public class TurnOffCommand implements DeviceCommand {
    private final SmartDevice device;

    public TurnOffCommand(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }
}
