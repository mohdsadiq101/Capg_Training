package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
//@Service
//@Repository
 /* all 3 have the same purpose and are only used to define the different layers of the project in the documentation
    like we can use component for bean layer, service for service layer, repository for dao layer */
public class Car {
    @Value("${carname}") // ${carname} --> SPEL(Spring Expression Language)
    private String name;
    @Autowired
//    @Qualifier("cng") // Qualifier is must
    @Qualifier("cng") // either we can pass the exact class name in the Qualifier or we can give the particular id in the component of that class
    private IEngine engine;
    @Autowired
//    @Qualifier("jk")
//    @Qualifier()
    private ITyre tyre;

    public Car(){
    }

    public Car(IEngine engine, ITyre tyre) {
        super();
        this.engine = engine;
        this.tyre = tyre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public ITyre getTyre() {
        return tyre;
    }

    public void setTyre(ITyre tyre) {
        this.tyre = tyre;
    }

    public void printCar(){
        System.out.println("Car Name: " + name);
        System.out.println("BHP: "+ engine.getBHP());
        System.out.println("Tyre Details: " + tyre.getTyreDetails());
    }
}
