package com.rishav.springioc;

public class Airtel implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling via Airtel sim");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet via Airtel sim");
    }
}
