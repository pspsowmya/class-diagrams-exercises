package com.exercises.model;

public class Student {
    private String name;
    public Grade grade;
    private int group;
    private final String SECRET_NICKNAME = "MySecretNickName";

    public Student(String name, Grade grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }


    public Grade getStudentGrade() {
        return grade;
    }

    public String getStudentName() {
        return name;
    }

    public Grade upgrade(Grade grade) {
        if (grade.equals(Grade.B)) {
            grade = Grade.A;
        } else if (grade.equals(Grade.C)) {
            grade = Grade.B;
        } else if (grade.equals(Grade.D)) {
            grade = Grade.C;
        } else if (grade.equals(Grade.E)) {
            grade = Grade.D;
        } else if (grade.equals(Grade.F)) {
            grade = Grade.E;
        }
        return grade;
    }

    public Grade downgrade(Grade grade) {
        if (grade.equals(Grade.A)) {
            grade = Grade.B;
        } else if (grade.equals(Grade.B)) {
            grade = Grade.C;
        } else if (grade.equals(Grade.C)) {
            grade = Grade.D;
        } else if (grade.equals(Grade.D)) {
            grade = Grade.E;
        } else if (grade.equals(Grade.E)) {
            grade = Grade.F;
        }
        return grade;
    }

}

