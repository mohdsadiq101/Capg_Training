package com.cg.ManyToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.HashSet;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student s = new Student("Rahul");
        Set<Course> set = new HashSet<Course>();
        Course c1 = new Course("Java");
        Course c2 = new Course("Spring");
        set.add(c1);
        set.add(c2);
        s.setCourses(set);
        em.persist(c1);
        em.persist(c2);
        em.persist(s);

        em.getTransaction().commit();
        System.out.println("Created...");
    }
}
