package org.example.adapter;

public class MicroUsbToUsbCAdapter implements UsbCCharger{
    private final MicroUsbCharger microUsbCharger;

    public MicroUsbToUsbCAdapter(MicroUsbCharger microUsbCharger) {
        this.microUsbCharger = microUsbCharger;
    }

    @Override
    public void chargeWithUsbC() {
        microUsbCharger.chargeWithMicroUsb();
    }
}
