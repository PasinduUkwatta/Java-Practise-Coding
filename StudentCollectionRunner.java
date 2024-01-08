package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AsendingStudentComaprator implements Comparator<StudentCollection>{
    @Override
    public int compare(StudentCollection student1, StudentCollection student2) {

        return Integer.compare(student1.getId(),student2.getId());
    }
}

public class StudentCollectionRunner {
    
    public static void main(String[] args) {
        List<StudentCollection> students = List.of(new StudentCollection(1,"Pasindu"),new StudentCollection(2,"Thiwnaka"));
        System.out.println(students);

        List<StudentCollection> studentAl =new ArrayList<>(students);
        Collections.sort(studentAl);
    }
}
