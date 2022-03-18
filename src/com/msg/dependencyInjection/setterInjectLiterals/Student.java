package com.msg.dependencyInjection.setterInjectLiterals;

public class Student {

    private int id;
    private String studentName; //making secure and preparing setter for it (Note: it's called encapsulation)

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void displayStudentInfo() {
        System.out.println("studentName : " + studentName +" id : " + id);
    }
}
