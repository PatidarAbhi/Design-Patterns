package org.example.homeAutomationSystem.Adapter;

import org.example.homeAutomationSystem.command.SmartDevice;

public class SecurityCameraAdapter implements SmartDevice {

    private final SecurityCamera smartSecurityCamera;

    public SecurityCameraAdapter(SecurityCamera smartSecurityCamera) {
        this.smartSecurityCamera = smartSecurityCamera;
    }


    @Override
    public void on() {
        smartSecurityCamera.activateMotionDetection();
    }

    @Override
    public void off() {
        smartSecurityCamera.deactivateMotionDetection();
    }
}
