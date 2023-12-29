package org.example;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> listOfMarks= new ArrayList<Integer>();

    public Student(String name, ArrayList<Integer> listOfMarks) {
        this.name = name;
        this.listOfMarks = listOfMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


