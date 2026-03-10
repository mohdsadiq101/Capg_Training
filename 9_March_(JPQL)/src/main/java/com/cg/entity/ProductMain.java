package com.cg.entity;

import jakarta.persistence.*;

import java.sql.ResultSet;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        // to read data
//        TypedQuery<Product> q = em.createQuery("select p from Product p",Product.class);
//        List<Product> li = q.getResultList();
//        li.forEach(p-> System.out.println(p.getName()+"\t"+p.getPrice()));

        // to read particular columns
//        TypedQuery<Object[]> q = em.createQuery("select p.name,p.price,p.mfd from Product p",Object[].class);
//        List<Object[]> li = q.getResultList();
//        li.forEach(p-> System.out.println(p[0] + "\t" + p[1] + "\t" + p[2]));

        // another method for above (here ProductDTO class has to be created by user)
//        TypedQuery<ProductDTO> q = em.createQuery("select new ProductDTO(p.name,p.price,p.mfd) from Product p",ProductDTO.class);
//        List<ProductDTO> li = q.getResultList();
//        li.forEach(p-> System.out.println(p));


        // to get data using where
//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.price<:p",Product.class);
//        q.setParameter("p",80000);
//        List<Product> li = q.getResultList();
//        li.forEach(p-> System.out.println(p));

//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.name like :p",Product.class);
//        q.setParameter("p","L%");
//        List<Product> li = q.getResultList();
//        li.forEach(p-> System.out.println(p));

        // to update data
        em.getTransaction().begin();
        // createQuery is connected with the class that's why we need to provide class name in the query.
//        Query q1 = em.createQuery("update Product p set p.price=100000 where p.pid=:p");
//        q1.setParameter("p",102);
//        int row = q1.executeUpdate();

        // createNativeQuery works directly on the table that's why we have to provide table name in the query
        Query q1 = em.createNativeQuery("update product_table p set p.price=85000 where p.pid=:p");
        q1.setParameter("p",104);
        int row = q1.executeUpdate();
        em.getTransaction().commit();
    }
}