package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        Student student =new Student("Pasindu", new ArrayList<>(List.of(16, 22, 74, 85)));
        Student student1 =new Student();
        student1.setName("Thiwnaka");
        student1.setEmail("painsuukwatta96@gmail.com");

        System.out.println(student1.toString());
        Employee employee =new Employee();
        employee.setName("deshan");
        employee.setSalary(10000);

        System.out.println(employee);



        System.out.println(student.getNumberOfMarks());;
        System.out.println(student.getTotalSumOfMarks());;
        System.out.println(student.getMaxMarks());;
        System.out.println(student.getAvarage());;
        student.addNewMark(34);
        student.removeNewMark(16);


        String [] daysOfTheWeek = {"Monday","Tuesday","wednesday","thursday","friday","saturday","sunday"};

        String longdate ;
        int length =0;
        String dte ="";

        for(String day:daysOfTheWeek){
            if(length<day.length()){
                length=day.length();
                dte=day;
            }

        }
        System.out.println(dte);

        String [] daysOfTheWeekReverse= new String[6] ;
        ArrayList <String> days = new ArrayList<>();

       for(int i=daysOfTheWeek.length-1;i>=0;i--){
           days.add(daysOfTheWeek[i]);

       }

        System.out.println(days);
    }
}