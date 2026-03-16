package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("${eid}")
    private int empid;
    @Value("${name}")
    private String name;
    //field injection
//    @Autowired // mandatory
//    @Qualifier("getBean3") // qualifier is not good practice here so we use constructor injection
    private Address address;

//    public Employee(){}

    // constructor injection --> since Address is @Component therefore it will auto-inject the address
    // we do not use multiple constructors in constructors injection
    //@Autowired // not required since spring 4.0
    public Employee(Address address) {
        this.address = address;
    }

    // since it is required to write @Autowired in field injection but not in constructor injection that's why
    // field inj. is not a good practice, cons. inj. is

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printEmployeeDetails(){
        System.out.println("Employee ID:"+empid);
        System.out.println("Employee Name:"+name);
        System.out.println("====Address====");
        System.out.println("City: "+address.getCity());
        System.out.println("Country: "+address.getCountry());
        System.out.println("Zip: "+address.getZip());
    }
}
