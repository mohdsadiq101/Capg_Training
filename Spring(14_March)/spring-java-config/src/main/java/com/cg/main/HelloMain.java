package com.cg.main;

import com.cg.bean.HelloWorld;
import com.cg.cfg.MyConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {
    public static void main(String[] args) {
        ApplicationContext ctx  = new AnnotationConfigApplicationContext(MyConfig.class);
//        BeanFactory ctx = new ClassPathXmlApplicationContext("bean.xml");
//        HelloWorld h = (HelloWorld) ctx.getBean("h");
        HelloWorld h = ctx.getBean(HelloWorld.class);
//        System.out.println(h==h1);
        System.out.println(h.sayHello());

        // ApplicationContext is child of BeanFactory i.e. AC inherited every functionality of BF but not vice versa
    }
}
