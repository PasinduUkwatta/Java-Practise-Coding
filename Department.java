package org.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<StreamEmployee> employees;

    public Department(String name){
        this.name=name;
        employees=new ArrayList<>();

    }

    public void addEmployee(StreamEmployee employee) {
employees.add(employee) ;   }

    public List<StreamEmployee> getEmployee() {
        return employees;  }

}


