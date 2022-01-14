package com.exercises.model;

public class Student {
    private String name;
    private String grade;
    private int group;
    private final String secretNickName = "MySecretNickName";

    public Student(String name, String grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getStudentGrade() {
        return grade;
    }

    public String getStudentName() {
        return name;
    }


    public String upgrade(String grade) {
        if (grade.equals("B")) {
            grade = "A";
        } else if (grade.equals("C")) {
            grade = "B";
        } else if (grade.equals("D")) {
            grade = "C";
        } else if (grade.equals("E")) {
            grade = "D";
        } else if (grade.equals("F")) {
            grade = "E";
        }
        return grade;
    }

    public String downgrade(String grade) {
        if (grade.equals("A")) {
            grade = "B";
        } else if (grade.equals("B")) {
            grade = "C";
        } else if (grade.equals("C")) {
            grade = "D";
        } else if (grade.equals("D")) {
            grade = "E";
        } else if (grade.equals("E")) {
            grade = "F";
        }
        return grade;
    }

}

