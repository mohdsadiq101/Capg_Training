package com.cg.service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired // --> spring boot will automatically provide an object of IEmployeeRepo
    private IEmployeeRepo erepo;
    public String createEmployee(Employee emp) {
        Employee e = erepo.saveAndFlush(emp);
        return "Employee Created! Your empID is:" + e.getEmpid();
    }

    public List<Employee> getAllEmployee(){
        return erepo.findAll(); // returns all the objects as a list
    }

    public Employee getEmployee(int id){
        //    return erepo.findById(id).get();

        // OR

        Optional<Employee> op = erepo.findById(id);
        if (op.isPresent())
            return op.get();
        else
            return null;
    }

    public String removeEmployee(int empid){
        if (getEmployee(empid) != null){
            erepo.deleteById(empid);
            return "Employee Removed";
        }
        return "Employee ID not Found";
    }

    public String updateEmployee(Employee e){
        erepo.saveAndFlush(e);
        return "Employee Updated...";
    }

    public List<Employee> getEmployeeByName(String name){
        return erepo.findByNa(name);
    }

    public List<Employee> getSalaryLessThan(double salary){
        return erepo.findBySalaryLessThan(salary);
    }

    public List<Employee> getNameAndSalary(String name, double salary){
        return erepo.findByNameAndSalary(name,salary);
    }

    public List<Employee> getStartDateBetween(LocalDate start, LocalDate end){
        return erepo.findByDobBetween(start,end);
    }
}
