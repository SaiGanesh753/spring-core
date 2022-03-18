package com.msg.dependencyInjection.constructorInjection;

import com.msg.dependencyInjection.setterInjectLiterals.Student;

public class Teacher {

    private int id;
    private String teacherName;
    private Student student;

    public Teacher(int id, String teacherName, Student student) {
        this.id = id;
        this.teacherName = teacherName;
        this.student = student;
    }

    public void displayInfo() {
        System.out.println("teacher id : " + id + " and teacher name : " + teacherName + " student data ");
        student.displayStudentInfo();
    }

}
