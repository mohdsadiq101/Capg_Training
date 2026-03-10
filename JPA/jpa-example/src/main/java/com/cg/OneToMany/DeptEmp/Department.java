package com.cg.OneToMany.DeptEmp;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int deptId;
    @Column(unique = true)
    private String deptName;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employee;

    public Department(){}

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
