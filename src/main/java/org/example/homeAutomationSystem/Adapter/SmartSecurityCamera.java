package org.example.homeAutomationSystem.Adapter;

public class SmartSecurityCamera implements SecurityCamera{
    @Override
    public void activateMotionDetection() {
        System.out.println("Motion detection activated on the security camera.");
    }

    @Override
    public void deactivateMotionDetection() {
        System.out.println("Motion detection deactivated off the security camera.");
    }
}
