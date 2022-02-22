package com.msg;

import com.msg.interFc.Sim;

public class Airtel implements Sim {

    public Airtel() {
        System.out.println("-----------------");
        System.out.println("testing is initiated or not....");
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
