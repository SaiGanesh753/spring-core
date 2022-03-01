package com.msg.SetterInjectLiterals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Setter injection
        Student sai = context.getBean("sai", Student.class);
        sai.displayStudentInfo();

        Student ganesh = context.getBean("ganesh", Student.class);
        ganesh.displayStudentInfo();

        //Construction Injection
        Teacher teacher = context.getBean("teacher", Teacher.class);
        teacher.displayInfo();

    }
}
