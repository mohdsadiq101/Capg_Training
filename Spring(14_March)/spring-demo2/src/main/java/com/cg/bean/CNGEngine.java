package com.cg.bean;

import org.springframework.stereotype.Component;

@Component("cng") // give the id in the qualifier in car class which is 'cng'
public class CNGEngine implements IEngine{
    @Override
    public String getBHP() {
        return "CNG Engine with 110 BHP";
    }
}
