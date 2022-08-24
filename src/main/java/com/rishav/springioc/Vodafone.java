package com.rishav.springioc;

public class Vodafone implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling via Vodafone sim");
    }

    @Override
    public void data() {
        System.out.println("Browsing internet via Vodafone sim");
    }
}
