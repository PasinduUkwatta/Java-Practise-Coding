package org.example;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student extends Person {

    private String college;
    private int year;

    private ArrayList<Integer> listOfMarks= new ArrayList<Integer>();

    public Student(String name, ArrayList<Integer> listOfMarks) {
        this.setName(name);
        this.listOfMarks = listOfMarks;
    }

    public Student() {

    }


    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Integer> getListOfMarks() {
        return listOfMarks;
    }

    public void setListOfMarks(ArrayList<Integer> listOfMarks) {
        this.listOfMarks = listOfMarks;
    }

    int getNumberOfMarks(){
        return listOfMarks.size();
    }

    int getTotalSumOfMarks(){
        int sum =0;
        for (Integer listOfMark : listOfMarks) {
            sum = sum + listOfMark;
        }

        return sum;

    }

    int getMaxMarks(){

        return Collections.max(listOfMarks);
    }
    int getMinMarks(){
        return Collections.min(listOfMarks);
    }

    BigDecimal getAvarage(){
        return (BigDecimal.valueOf(getTotalSumOfMarks())).divide(BigDecimal.valueOf(getNumberOfMarks()));

    }

    void addNewMark(int mark){
        listOfMarks.add(mark);
        System.out.println(listOfMarks);
    }

    void removeNewMark(int mark){
        listOfMarks.remove((Integer) mark);
        System.out.println(listOfMarks);
    }
}


