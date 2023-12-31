package org.example;

public class Employee extends Student {

    private String title;
    private String employer;
    private String employerGrade;
    private int salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmployerGrade() {
        return employerGrade;
    }

    public void setEmployerGrade(String employerGrade) {
        this.employerGrade = employerGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", employerGrade='" + employerGrade + '\'' +
                ", salary=" + salary +
                '}';
    }
}
