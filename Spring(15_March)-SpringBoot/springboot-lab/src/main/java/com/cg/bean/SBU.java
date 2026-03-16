package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SBU {
    @Value("${scode}")
    private String sbuCode;
    @Value("${sname}")
    private String sbuName;
    @Value("${shead}")
    private String sbuHead;
    private List<Employee> empList;

    // for task 2
//    public SBU(){}
//
//    public SBU(String sbuCode, String sbuName, String sbuHead) {
//        this.sbuCode = sbuCode;
//        this.sbuName = sbuName;
//        this.sbuHead = sbuHead;
//    }

    // for task 3
//    public SBU(List<Employee> empList) {
//        this.empList = empList;
//    }

    public String getSbuCode() {
        return sbuCode;
    }

    public void setSbuCode(String sbuCode) {
        this.sbuCode = sbuCode;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "SBU {" + "sbuCode=" + sbuCode + ", sbuName=" + sbuName  + ", sbuHead=" + sbuHead + '}';
    }

    //  for Task 2
    public void getSbuDetails(){
        System.out.println("SBU Details:");
        System.out.println("SBU {" + "sbuCode=" + sbuCode + ", sbuName='" + sbuName + '\'' + ", sbuHead='" + sbuHead + '\'' + '}');
    }

    // for task 3
    public void display(){
        System.out.println("SBU Details:");
        System.out.println("SBU {" + "sbuCode=" + sbuCode + ", sbuName='" + sbuName + '\'' + ", sbuHead='" + sbuHead + '\'' + '}');
        System.out.println("--------------------");
        System.out.println("Employee Details:");
        for (Employee li : empList){
            System.out.println(li.toString());
        }
    }

    // for task 4
    public void getEmployee(int id){
        for(Employee e : empList){
            if(e.getEmpId()==id) {
                System.out.println("Employee Info:");
                System.out.println("Employee ID: "+id);
                System.out.println("Employee Name: "+e.getEmpName());
                System.out.println("Employee Salary: "+e.getSalary());
            }
        }
    }
}
