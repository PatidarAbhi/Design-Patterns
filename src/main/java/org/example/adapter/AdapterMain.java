package org.example.adapter;

public class AdapterMain {


    public static void chargeWithC() {
        MicroUsbCharger microUsbCharger =new MicroUsbCharger();
         MicroUsbToUsbCAdapter microUsbToUsbCAdapter = new MicroUsbToUsbCAdapter(microUsbCharger);
        MobilePhone mobilePhone = new MobilePhone(microUsbToUsbCAdapter);
        mobilePhone.charge();
    }

}
