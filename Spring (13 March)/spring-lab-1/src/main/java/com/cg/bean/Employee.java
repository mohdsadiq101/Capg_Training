package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int empId;
    private String empName;
    private double salary;
    private String businessUnit;
    private int age;
    private SBU sbu;

    public Employee(){}

    public Employee(int empId, String empName, double salary, String businessUnit, int age, SBU sbu) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.businessUnit = businessUnit;
        this.age = age;
        this.sbu = sbu;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SBU getSbu() {
        return sbu;
    }

    public void setSbu(SBU sbu) {
        this.sbu = sbu;
    }

    public void showEmployee(){
        System.out.println("=======Employee details======");
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee BU: "+businessUnit);
        System.out.println("Employee Age: "+age);
        getSbuDetails();
    }

    public void getSbuDetails() {
        System.out.println(this.sbu);
    }

    @Override
    public String toString() {
        return "Employee {" + "empID=" + empId + ", empName='" + empName + ", empAge='" + age + ",empSalary=" + salary+'}';
    }

}
