package org.example.adapter;

public class UsbCImpl implements  UsbCCharger{
    @Override
    public void chargeWithUsbC() {
        System.out.println("Charging with usb c type");
    }
}
