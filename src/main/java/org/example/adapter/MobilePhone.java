package org.example.adapter;

public class MobilePhone {
    private final UsbCCharger usbCCharger;

    public MobilePhone(UsbCCharger usbCCharger) {
        this.usbCCharger = usbCCharger;
    }

    public void charge() {
        usbCCharger.chargeWithUsbC();
    }
}
