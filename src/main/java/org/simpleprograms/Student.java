package org.simpleprograms;

public class Student {
    int rollNum;
    String name;
    int classRoom;
    Student(int rollNum,String name,int classRoom){
        this.rollNum=rollNum;
        this.name=name;
        this.classRoom=classRoom;
    }

    public static void main(String[] args) {
        var student=new Student(101,"Gary",10);
        System.out.println(student.name);
    }
}
