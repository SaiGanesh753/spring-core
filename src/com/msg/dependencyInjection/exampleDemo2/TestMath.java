package com.msg.dependencyInjection.exampleDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMath {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Friend1 friend1 = context.getBean("friend1", Friend1.class);
        friend1.cheatingFriend();
        Friend2 friend2 = context.getBean("friend2", Friend2.class);
        System.out.println("--------------------");
        friend2.cheatingFriend();
    }
}

