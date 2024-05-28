package org.example.homeAutomationSystem;

import org.example.homeAutomationSystem.Adapter.SecurityCameraAdapter;
import org.example.homeAutomationSystem.Adapter.SmartSecurityCamera;
import org.example.homeAutomationSystem.command.*;
import org.example.homeAutomationSystem.decorator.DeviceDecorator;
import org.example.homeAutomationSystem.decorator.PowerSavingDecorator;
import org.example.homeAutomationSystem.decorator.VacationModeDecorator;
import org.example.homeAutomationSystem.strategy.QuickCoolTemperatureControl;

public class AutomationMain {

    public static void automation() {
        //command pattern
        //we can add more device like fan , cooler etc..
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();

        DeviceCommand turnOn = new TurnOnCommand(airConditioner);
        turnOn.execute();

        DeviceCommand turnOff = new TurnOffCommand(airConditioner);
        turnOff.execute();

        DeviceDecorator powerSavingLight = new PowerSavingDecorator(new VacationModeDecorator(light));
        powerSavingLight.on();

        // like this we can add more strategy to do this like for light we can add BrightnessControl and then implement that
        // to concrete classes.. like LowBrightness , MediumBrightness etc..
        airConditioner.setTemperatureControl(new QuickCoolTemperatureControl());
        airConditioner.regulateTemperature();


        //here SmartSecurityCamera is different type of class and TurnOnCommand this is different
        // we are using adapter to make it compatible
        SecurityCameraAdapter smartSecurityCamera = new SecurityCameraAdapter(new SmartSecurityCamera());
        DeviceCommand camera = new TurnOnCommand(smartSecurityCamera);
        camera.execute();


    }
}
