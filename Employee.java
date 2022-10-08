package com.google.lesson_08;

public class Employee extends User {
    private double salary;
    private String jobTitle;
    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "money=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Employee(double salary, String jobTitle, String department) {
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public Employee(String firstName, String lastName, int age, Gender gender, String mail, String country, double salary, String jobTitle, String department) {
        super(firstName, lastName, age, gender, mail, country);
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
