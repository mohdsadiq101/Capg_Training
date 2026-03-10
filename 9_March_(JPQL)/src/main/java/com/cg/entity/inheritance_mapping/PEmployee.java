package com.cg.entity.inheritance_mapping;

import jakarta.persistence.DiscriminatorValue;

//@Entity
@DiscriminatorValue("Permanent_Employee")
public class PEmployee extends Employee {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}