package com.cg.cfg;

import com.cg.bean.Address;
import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
    @Bean("h")
//    @Scope("prototype") --> creates a new object everytime
    public HelloWorld getBean(){
        HelloWorld hello = new HelloWorld();
        hello.setName("Sadiq");
        return hello;
    }

    @Bean
    public Employee getBean1(){
        return new Employee();
    }

    @Bean
    public Address getBean2(){
        return new Address();
    }
}
