package com.cg.cfg;

import com.cg.bean.Employee;
import com.cg.bean.SBU;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:data.properties")
public class MyConfig {

    @Bean
    public Employee emp1() {
        return (new Employee(101, "Sadiq", 60000, "PES-BU", 22));
    }

    @Bean
    public Employee emp2() {
        return (new Employee(102, "Zaid", 50000, "PES-BU", 21));
    }

}
