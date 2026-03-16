package com.cg;

import com.cg.bean.Employee;
import com.cg.bean.SBU;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("com")
public class SpringbootLabApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringbootLabApplication.class, args);

        // Task 1
//        Employee e = ctx.getBean(Employee.class);
//        e.showEmployee();

        // Task 2
//        SBU s2 = ctx.getBean(SBU.class);
//        s2.getSbuDetails();

        // Task 3
        SBU s3 = ctx.getBean(SBU.class);
        s3.display();

        // Task 4
//        SBU s4 = ctx.getBean(SBU.class);
//        s4.getEmployee(101);
    }
}
