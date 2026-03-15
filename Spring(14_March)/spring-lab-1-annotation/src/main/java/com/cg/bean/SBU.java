package com.cg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SBU {
    @Value("${code}")
    private String sbuCode;
    @Value("${sname}")
    private String sbuName;
    @Value("${head}")
    private String sbuHead;
    private List<Employee> empList;

    public SBU(){}

    public SBU(String sbuId, String sbuName, String sbuHead, List<Employee> empList) {
        this.sbuCode = sbuId;
        this.sbuName = sbuName;
        this.sbuHead = sbuHead;
        this.empList = empList;
    }

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
        return "SBU {" + "sbuCode=" + sbuCode + ", sbuName='" + sbuName + '\'' + ", sbuHead='" + sbuHead + '\'' + '}';
    }

    public void display(){
        System.out.println("SBU Details:");
        System.out.println("SBU {" + "sbuCode=" + sbuCode + ", sbuName='" + sbuName + '\'' + ", sbuHead='" + sbuHead + '\'' + '}');
        for (Employee li : empList){
            System.out.println(li.toString());
        }
    }

    public Employee getEmployee(int id){
        for(Employee e : empList){
            if(e.getEmpId()==id)
                return e;
        }
        return null;
    }
}
