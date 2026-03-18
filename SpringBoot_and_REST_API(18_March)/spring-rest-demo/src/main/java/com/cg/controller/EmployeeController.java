package com.cg.controller;

import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("employees") // gives the initial path for all the methods
public class EmployeeController {
//    @GetMapping("employees")
//    public Employee getXyz(){
//        return new Employee(1001,"Sadiq", LocalDate.of(2002,7,16),10000); // It returns the JSON value and connects through jackson
//    }

//    @Autowired // used in field injection
    private IEmployeeService service;

    // constructor injection (good practice)
    public EmployeeController(IEmployeeService service){
        super();
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAllEmp(){
        return service.getAllEmployee();
    }

    @GetMapping("/{eid}")
    public Employee getEmpById(@PathVariable int eid){
        return service.getEmployee(eid);
    }

    @GetMapping("/name/{name}")
    public List<Employee> getEmpByName(@PathVariable String name){
        return service.getEmployeeByName(name);
    }

    @PostMapping
    public Employee createNewEmployee(@RequestBody Employee emp){
        return service.createEmployee(emp);
    }

    @DeleteMapping("/{id}")
    public String deleteEmp(@PathVariable int id){
        return service.removeEmployee(id);
    }

    @PutMapping
    public Employee updateEmp(@RequestBody Employee emp){
        return service.updateEmployee(emp);
    }
}
