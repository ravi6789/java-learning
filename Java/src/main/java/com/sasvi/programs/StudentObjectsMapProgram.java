package com.sasvi.programs;

import com.sasvi.modal.Student;

import java.util.*;

public class StudentObjectsMapProgram {

    public static void main(String args[]) {

        // createHashMapFromListStudentNumberAsKey
        // Display map elements - iterateMapElements()

        //createLinkedHashMapFromListStudentNumberAsKey()
        // Display map elements - iterateMapElements()

        // createTreeMapFromListStudentNumberAsKey
        // Display map elements - iterateMapElements()

         // createMapFromListUniveristyAsKey()

    }





    private static Map<Integer, Student> createHashMapFromListStudentNumberAsKey(List<Student> students) {

        Map<Integer, Student> studentMap = new HashMap<>();

        // Iterate student objects in list, put object info in map. Key is student number

        return studentMap;
    }


    private static Map<Integer, Student> createLinkedHashMapFromListStudentNumberAsKey(List<Student> students) {

        Map<Integer, Student> studentMap = new LinkedHashMap<>();

        // Iterate student objects in list, put object info in map. Key is student number

        return studentMap;
    }

    private static Map<Integer, Student> createTreeMapFromListStudentNumberAsKey(List<Student> students) {

        Map<Integer, Student> studentMap = new TreeMap<>();

        // Iterate student objects in list, put object info in map. Key is student number

        return studentMap;
    }


    private void iterateMapElements(Map<Integer, Student> studentMap) {
         // Display map values using for each loop
          // 1. by keys



          // 2. by Map.Entry
           //////

    }






    private static Map<Integer,  List<Student>> createMapFromListUniveristyAsKey(List<Student> students) {

        Map<Integer, List<Student>> studentMap = new HashMap<>();

        // Iterate student objects in list, put object info in map. Key is student number

        return studentMap;
    }





}
