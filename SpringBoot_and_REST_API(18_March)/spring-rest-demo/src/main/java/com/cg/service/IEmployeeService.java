package com.cg.service;

import com.cg.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> getAllEmployee();
    public Employee createEmployee(Employee emp);
    public Employee getEmployee(int empid);
    public String removeEmployee(int empid);
    public Employee updateEmployee(Employee e);
    public List<Employee> getEmployeeByName(String name);
}
