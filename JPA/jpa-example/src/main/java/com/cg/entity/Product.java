package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

import java.time.LocalDate;

@Entity // this will look into our db that if there is Product table or not(if not it will create one) but will show error if update line in persistence.xml is not there
public class Product {
    @Id // sets the very below column as primary key in this case 'pid'
    private int pid;
    private String name;
    private double price;
//    @Transient  // this will make the compiler to skip the below attribute everytime
    private int qty;
    private LocalDate dom;

    public Product(){}

    public Product(int pid, String name, double price, int qty, LocalDate dom) {
        super();
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.dom = dom;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public LocalDate getDom() {
        return dom;
    }

    public void setDom(LocalDate dom) {
        this.dom = dom;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
