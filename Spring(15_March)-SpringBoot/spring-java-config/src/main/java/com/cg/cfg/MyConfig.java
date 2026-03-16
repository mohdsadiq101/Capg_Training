package com.cg.cfg;

import com.cg.bean.Address;
import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:data.properties")
@ComponentScan("com")
public class MyConfig {
//    @Bean("h")
//    @Scope("prototype") // --> creates a new object everytime
//    public HelloWorld getBean(){
//        HelloWorld hello = new HelloWorld();
//        hello.setName("Sadiq");
//        return hello;
//    }
//
//    @Bean
//    public Employee getBean1(){
//        return new Employee(getBean2());
//    }
//
//    @Bean
//    public Address getBean2(){
//        return new Address();
//    }

//    @Bean
//    public Address getBean3(){
//        Address add = new Address();
//        add.setCity("Lebanon");
//        add.setCountry("Iran");
//        add.setZip(2005);
//        return add;
//    }
}
