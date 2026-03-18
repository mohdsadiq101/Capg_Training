package com.cg;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import com.cg.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataAppApplication {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(SpringDataAppApplication.class, args);

//        IEmployeeRepo erepo = ctx.getBean(IEmployeeRepo.class);
//        erepo.save(new Employee(2,"Zaid", LocalDate.of(2001,3,13),56000));
//        System.out.println("Employee Created...");

        EmployeeService es = ctx.getBean(EmployeeService.class);
//        System.out.println(es.createEmployee(new Employee("Priya",LocalDate.of(2002,4,17),52000)));
//        System.out.println(es.createEmployee(new Employee("Naina",LocalDate.of(2004,5,12),33000)));
//        System.out.println(es.createEmployee(new Employee("Zaid",LocalDate.of(2001,6,13),24000)));
//        System.out.println(es.createEmployee(new Employee("Piyush",LocalDate.of(2003,10,30),55000)));
//        System.out.println(es.createEmployee(new Employee("Sadiq",LocalDate.of(2002,5,11),47000)));


        // get all employee
//        es.getAllEmployee().forEach(e-> System.out.println(e));

        // find employee by id
//        System.out.println(es.getEmployee(2));

        // delete employee by id
//        System.out.println(es.removeEmployee(2));

        // update employee
//        Employee e = es.getEmployee(2);
//        System.out.println(es.updateEmployee(new Employee()));
//        if (e!=null){
//            e.setName("Faiz");
//            e.setDob(LocalDate.of(2003,10,21));
//            System.out.println(es.updateEmployee(e));
//        } else {
//            System.out.println("Employee not found");
//        }


//        es.getEmployeeByName("Sadiq").forEach(e-> System.out.println(e));

//        es.getSalaryLessThan(40000).forEach(e-> System.out.println(e));

//        es.getNameAndSalary("")

        // find employees born in October month of 2003
        es.getStartDateBetween(LocalDate.of(2003,10,01),LocalDate.of(2003,10,30)).forEach(e-> System.out.println(e));


    }

}
