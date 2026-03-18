package com.cg.service;

import com.cg.dao.IEmployeeRepo;
import com.cg.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepo repo;

    @Override
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    @Override
    public Employee createEmployee(Employee emp) {
        repo.saveAndFlush(emp);
        return null;
    }

    @Override
    public Employee getEmployee(int empid) {
        return repo.findById(empid).get();
    }

    @Override
    public String removeEmployee(int empid) {
        if (getEmployee(empid) != null){
            repo.deleteById(empid);
            return "Employee Deleted";
        }
        return "Employee ID not found";
    }

    @Override
    public Employee updateEmployee(Employee e) {
        if (getEmployee(e.getEmpid()) != null)
           return repo.saveAndFlush(e);
        return null;
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        return repo.findByName(name);
    }
}
