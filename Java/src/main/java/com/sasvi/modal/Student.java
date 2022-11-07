package com.sasvi.modal;

public class Student {

    private int number;
    private String name;
    private String university;

    public Student() {

    }

    public Student(int number, String name, String university) {
        this.number = number;
        this.name = name;
        this.university = university;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
