package com.msg;

import com.msg.interFc.Sim;

public class Idea implements Sim {
    @Override
    public void calling() {
        System.out.println("calling from Idea sim");
    }

    @Override
    public void data() {
        System.out.println("browsing from Idea sim");
    }
}
