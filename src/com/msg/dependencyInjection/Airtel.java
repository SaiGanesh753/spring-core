package com.msg.dependencyInjection;

import com.msg.dependencyInjection.interFc.Sim;

public class Airtel implements Sim {

    public Airtel() {
        System.out.println("airtel class initiated");
    }

    @Override
    public void calling() {
        System.out.println("calling from Airtel sim");
    }

    @Override
    public void data() {
        System.out.println("browsing from Airtel sim");
    }
}
