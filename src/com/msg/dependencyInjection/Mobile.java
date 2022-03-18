package com.msg.dependencyInjection;

import com.msg.dependencyInjection.interFc.Sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
       //Not fully configured application. we need to take care of it. (change every time).
        /*Airtel airtel = new Airtel();
        airtel.calling();
        airtel.data();

        //Run time Polymorphism
        Sim sim = new Idea();
        sim.calling();
        sim.data();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("context loaded.");
        Airtel airtel = (Airtel) context.getBean("airtel");
        airtel.data();
        Idea idea = (Idea) context.getBean("idea");
        idea.calling();

        // Now the app is configurable, we can easily modify the bean classes in xml file.
        Sim sim = context.getBean("sim", Sim.class);
        sim.data();

    }
}
