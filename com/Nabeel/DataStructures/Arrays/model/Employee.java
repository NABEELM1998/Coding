package com.Nabeel.DataStructures.Arrays.model;

public class Employee {
    private int empId;
    private String name;
    private int salary;
    public Employee(int empId, String name, int salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }

    public int getEmpId(){
        return empId;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
