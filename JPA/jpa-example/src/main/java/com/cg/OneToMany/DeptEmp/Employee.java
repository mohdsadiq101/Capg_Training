package com.cg.OneToMany.DeptEmp;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    private String empName;
    private double salary;
    @ManyToOne
//    @JoinColumn(name = "dept_id")
    private Department dept;

    public Employee(){}

    public Employee(String empName,double salary, Department dept) {
        this.empName = empName;
        this.salary = salary;
        this.dept = dept;
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

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
