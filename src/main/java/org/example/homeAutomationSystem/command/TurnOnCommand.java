package org.example.homeAutomationSystem.command;

public class TurnOnCommand implements DeviceCommand {
    private final SmartDevice device;

    public TurnOnCommand(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }
}
