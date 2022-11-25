package com.sasvi.programs;

import com.sasvi.datatypes.Student;
import com.sasvi.datatypes.Student1;

public class StudentsProgram {

    //public is access specifier
    // void is return type
    // main is the method name
    // args[] - input variable name
    //static - class level method
    public static void main(String args[]) {

        setStudentObjectsInfoWithProperties();

        setStudentObjectsInfoWithGettersAndSetters();


    }


    private static void setStudentObjectsInfoWithProperties() {
        System.out.println(":: setStudentObjectsInfoWithProperties()  start ::");

        // Student object is created with default constructor -  new Student1()
        Student1 suresh  = new Student1();
        // Since the object properties Access scope is public, they can be directly accessed outside Student1 class.
        suresh.number = 1;
        suresh.name = "suresh";
        suresh.university = "uta";


        Student1 sarath  = new Student1();
        sarath.number = 1;
        sarath.name = "suresh";
        sarath.university = "uta";

        // Student object is created with parameterized constructor.
        Student1 mukesh  = new Student1(3, "mukesh",  "utd");

        //Use getter methods to get the value.
        System.out.println("Suresh info :");
        System.out.println( "number "+ suresh.number);
        System.out.println( "name "+ suresh.name);
        System.out.println( "university "+ suresh.university);

        //Use getter methods to get the value.
        System.out.println("Sarath info :");
        System.out.println( "number "+ sarath.number);
        System.out.println( "name "+ sarath.name);
        System.out.println( "university "+ sarath.university);

        System.out.println(":: setStudentObjectsInfoWithProperties()  End ::");

    }


    private static void setStudentObjectsInfoWithGettersAndSetters() {
        System.out.println(":: setStudentObjectsInfoWithGettersAndSetters()  Start ::");
        Student suresh  = new Student();
        // Since the object properties Access scope is private, they can not be directly accessed outside Student class.
        // So using setter methods to set the value. Setters method access scope is public.
        suresh.setNumber(1);
        suresh.setName("suresh");
        suresh.setUniversity("usa");

        Student sarath  = new Student();
        sarath.setNumber(1);
        sarath.setName("sarath");
        sarath.setUniversity("uta");

        // Student object is created with parameterized constructor.
        Student mukesh  = new Student(3, "mukesh",  "utd");

        //Use getter methods to get the value.
        System.out.println("Suresh info :");
        System.out.println( "number "+ suresh.getNumber());
        System.out.println( "name "+ suresh.getName());
        System.out.println( "university "+ suresh.getUniversity());

        //Use getter methods to get the value.
        System.out.println("Sarath info :");
        System.out.println( "number "+ sarath.getNumber());
        System.out.println( "name "+ sarath.getName());
        System.out.println( "university "+ sarath.getUniversity());

        System.out.println(":: setStudentObjectsInfoWithGettersAndSetters()  End ::");
    }
}
