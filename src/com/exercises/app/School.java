package com.exercises.app;

import com.exercises.model.Student;

public class School {

    public static void main(String[] args) {

        Student student = new Student("John", "B", 3);
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentGrade());
        System.out.println(student.upgrade("B"));
        System.out.println(student.downgrade("B"));

        Student student1 = new Student("Jack", "D", 1);
        System.out.println(student1.getStudentName());
        System.out.println(student1.getStudentGrade());
        System.out.println(student1.upgrade("D"));
        System.out.println(student1.downgrade("D"));

        Student student2 = new Student("Richa", "C", 2);
        System.out.println(student2.getStudentName());
        System.out.println(student2.getStudentGrade());
        System.out.println(student2.upgrade("C"));
        System.out.println(student2.downgrade("C"));
    }
}
