package com.sasvi.datatypes;

//This class holds the properties of student object.
// A variable of this class can hold one student object.
public class Student {

    // number - variable holds should number info.
    // Access specifier private represents this property can be accessed only in this class
    private int number;
    private String name;
    private String university;

    // Default constructor method
    public Student() {

    }

    // Parameterised constructor method
    public Student(int number, String name, String university) {
        this.number = number;
        this.name = name;
        this.university = university;
    }

    // Getters and Setters for object properties. These are needed since properties(number, name, university) scope is private



    // This method gives object's number value
    public int getNumber() {
        return number;
    }

    //This method sets object's number property.
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
