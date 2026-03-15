package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Car c = (Car)ctx.getBean("car");


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Engine type: Petrol or CNG");
//        String etype = sc.nextLine();
//        System.out.println("Enter Tyre type: MRF of JK");
//        String tyre = sc.nextLine();
//
//        IEngine e = (IEngine) ctx.getBean(etype.toLowerCase());
//        ITyre t = (ITyre) ctx.getBean(tyre.toLowerCase());
//        c.setEngine(e);
//        c.setTyre(t);

        c.printCar();
    }
}
