package com.exercises.app;

import com.exercises.model.Student;
import com.exercises.model.Grade;

public class School {

    public static void main(String[] args) {


        Student student = new Student("John", Grade.B, 3);
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentGrade());
        System.out.println(student.upgrade(Grade.B));
        System.out.println(student.downgrade(Grade.B));

        Student student1 = new Student("Jack", Grade.D, 1);
        System.out.println(student1.getStudentName());
        System.out.println(student1.getStudentGrade());
        System.out.println(student1.upgrade(Grade.D));
        System.out.println(student1.downgrade(Grade.D));

        Student student2 = new Student("Richa", Grade.C, 2);
        System.out.println(student2.getStudentName());
        System.out.println(student2.getStudentGrade());
        System.out.println(student2.upgrade(Grade.C));
        System.out.println(student2.downgrade(Grade.C));
    }
}
