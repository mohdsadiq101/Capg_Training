package com.cg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Employee {
    // Used value injection for task 1 only
//    @Value("${eid}")
    private int empId;
//    @Value("${name}")
    private String empName;
//    @Value("${salary}")
    private double salary;
//    @Value("${bu}")
    private String businessUnit;
//    @Value("${age}")
    private int age;
    private SBU sbu;

    public Employee(){}

    public Employee(int empId, String empName, double salary, String businessUnit, int age) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.businessUnit = businessUnit;
        this.age = age;
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

    // for task 1
    public void showEmployee(){
        System.out.println("====Employee details====");
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee BU: "+businessUnit);
        System.out.println("Employee Age: "+age);
    }

    @Override
    public String toString() {
        return "Employee {" + "empID=" + empId + ", empName=" + empName + ", empAge=" + age + ",empSalary=" + salary+'}';
    }

}
