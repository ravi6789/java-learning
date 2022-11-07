package com.sasvi.programs;

import com.sasvi.modal.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SutdentObjectsProgram {

    public static void main(String args[]) {
        // create student objects. use the method - createStudents()

        List<Student> students   = createStudents();


        // print student information using iterator. use the method - printStudentsInfoUsingIterator
        printStudentsInfoUsingIterator(students);
        // print student information using iterator. use the method - printStudentsInfoUsingForEachLoop
        printStudentsInfoUsingForEachLoop(students);

        // get student info by id. use the method - getStudent();

        // filer students by name . Dont change the original list

        // filer students by university . Dont change the original list.


        // sort students by number

        // sort students by age

        // sort students by name

        


    }




    private static List<Student> filterStudentsByName( List<Student> students, String name) {
        List<Student> resultList = new ArrayList<>();

        for( Student s : students) {
           if(s.getName().equals(name)) {
               resultList.add(s);
           }
        }

        return resultList;
    }

    private static List<Student> filterStudentsByUniversity( List<Student> students, String university) {

        List<Student> resultList = new ArrayList<>();

        for( Student s : students) {
            if(s.getUniversity().equals(university)) {
                resultList.add(s);
            }
        }

        return resultList;
    }

    private static Student getStudent( List<Student> students, int number) {

        Student result = null;

        for( Student s : students) {
          if(s.getNumber() == number) {
              result =s;
              break;
          }
        }


//        for( Student s : students) {
//            if(s.getNumber() == number) {
//              return s;
//            }
//        }

        return result;
    }


    private List<Student> sortStudentsByNumber(List<Student> students) {

        return null;
    }

    private List<Student> sortStudentsByAge(List<Student> students) {

        return null;
    }

    private List<Student> sortStudentsByName(List<Student> students) {

        return null;
    }



    private static List<Student> createStudents() {
        //Create few student objects
        Student sarath = new Student(1, "sarath", "uta");
        Student saswith = new Student(2, "saswith", "ua");
        Student suhavi = new Student(3, "suhavi", "ua");
        Student suresh = new Student(5, "suresh", "uta");
        Student saswith2 = new Student(6, "saswith", "uta");

        List<Student> students = new ArrayList();


        students.add(sarath);
        students.add(saswith);
        students.add(suhavi);
        students.add(suresh);

       // add them to list
       return students;
    }

    private static void printStudentsInfoUsingIterator(List<Student> students) {
        Iterator<Student> studentIterator = students.iterator();

        // Condition check for elements in List
        // using hasNext() method returning true till
        // there i single element in a List
        while (studentIterator.hasNext()) {
            Student s = studentIterator.next();
            System.out.println(s.getName());
            System.out.println(s.getNumber());
            System.out.println(s.getUniversity());
        }
    }

    private static void printStudentsInfoUsingForEachLoop(List<Student> students) {

        for( Student s : students) {
            System.out.println(s.getName());
            System.out.println(s.getNumber());
            System.out.println(s.getUniversity());
        }

    }

}
