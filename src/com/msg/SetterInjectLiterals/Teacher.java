package com.msg.SetterInjectLiterals;

public class Teacher {

    private int id;
    private String teacherName;

    public Teacher(int id, String teacherName) {
        this.id = id;
        this.teacherName = teacherName;
    }

    public void displayInfo() {
        System.out.println("teacher id : " + id + " and teacher name : " + teacherName);
    }

}
