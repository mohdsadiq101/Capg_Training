package com.cg.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class CriteriaDemo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
        Root<Product> r = cq.from(Product.class);

        // to get products starting with I
//        cq.select(r).where(cb.like(r.get("name"),"I%"));

        // to get products  whose price is greater than given amount
//        Predicate con1 = cb.greaterThan(r.get("price"),100000);

        // to get products in between given range prices
        Predicate con1 = cb.greaterThan(r.get("price"),40000);
        Predicate con2 = cb.lessThan(r.get("price"),65000);
//        cq.select(r).where(cb.and(con1,con2));

        // to get products in ascending or desc order by price
//        cq.select(r).orderBy(cb.asc(r.get("price")));
//        cq.select(r).orderBy(cb.desc(r.get("price")));

        cq.select(r).where(con1,con2).orderBy(cb.asc(r.get("price")));

        List<Product> li = em.createQuery(cq).getResultList();
        li.forEach(p-> System.out.println(p));
    }
}
