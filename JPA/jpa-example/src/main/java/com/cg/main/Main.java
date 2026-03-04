package com.cg.main;

import com.cg.entity.Product;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Product p1 = new Product(103,"Book",1500,50, LocalDate.of(2025,6,20));
//        Product p2 = new Product(104,"Ball",500,5, LocalDate.of(2025,12,25));
//        Product p3 = new Product(105,"HP-ENVY",195000,6, LocalDate.of(2026,1,25));
//        Product p4 = new Product(106,"Dell",56000,10, LocalDate.of(2025,9,23));


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        em.persist(p);
//        tx.commit();

//        //Alternative to above method
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.persist(p4);
//        // here all the above is stored in a persistence context or persistence cache
//        // to make the changes in the database we need to commit
//        em.getTransaction().commit();
//        // if we do not commit then it will remain persistence context
//        System.out.println("Product created...");
//          em.remove(p4);
          // removes the operation from persistence context and if we commit then also from db

        // to find a data
//        Product p = em.find(Product.class,101);
//        System.out.println(p.getName());

//        em.getTransaction().begin();
//        Product p = em.find(Product.class,104);
//        if (p!=null) {
//            em.remove(p);
//            System.out.println(p);
//        } else
//            System.out.println("Product Not Found");
//        em.getTransaction().commit();
//        boolean b = em.contains(p);
//        System.out.println(b);

        // to read the data from db
        Query q = em.createQuery("select p from Product p");
        List<Product> li = q.getResultList();
        li.forEach(p-> System.out.println(p));
    }
}
