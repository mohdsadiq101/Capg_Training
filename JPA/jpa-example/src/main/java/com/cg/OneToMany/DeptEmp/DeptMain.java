package com.cg.OneToMany.DeptEmp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DeptMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Department d1 = new Department("HR");
        Department d2 = new Department("Admin");
        Department d3 = new Department("Sales");

//        List<Employee> li = new ArrayList<>();
//        li.add(new Employee("Sadiq",100000,d));
//        li.add(new Employee("Zaid",80000,d));
//        li.add(new Employee("Faiz",50000,d));
//        li.add(new Employee("Piyush",40000,d));
//        d.setEmployee(li);
        em.persist(d1);
        em.persist(d2);
        em.persist(d3);
        em.getTransaction().commit();
        System.out.println("Created...");

//        Department d = em.find(Department.class, 52);
//        em.remove(d);
//        em.getTransaction().commit();
    }
}
