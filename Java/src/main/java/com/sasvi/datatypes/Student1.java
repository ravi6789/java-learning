package com.sasvi.datatypes;

//This class holds the properties of student object.
// A variable of this class can hold one student object.
public class Student1 {

    // number - variable holds should number info.
    // Access specifier public represents this property can be accessed outside of this class
    public int number;
    public String name;
    public String university;

    // Default constructor
    public Student1() {

    }

    // Parameterised constructor
    public Student1(int number, String name, String university) {
        this.number = number;
        this.name = name;
        this.university = university;
    }
}
