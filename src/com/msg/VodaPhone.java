package com.msg;

import com.msg.interFc.Sim;

public class VodaPhone implements Sim {
    @Override
    public void calling() {
        System.out.println("calling from VodaPhone sim");
    }

    @Override
    public void data() {
        System.out.println("browsing from VodaPhone sim");
    }
}
