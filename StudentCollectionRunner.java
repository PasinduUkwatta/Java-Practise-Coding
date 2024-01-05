package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {
    public static void main(String[] args) {
        List<StudentCollection> students = List.of(new StudentCollection(1,"Pasindu"),new StudentCollection(2,"Thiwnaka"));
        System.out.println(students);

        List<StudentCollection> studentAl =new ArrayList<>(students);
        Collections.sort(studentAl);
    }
}
