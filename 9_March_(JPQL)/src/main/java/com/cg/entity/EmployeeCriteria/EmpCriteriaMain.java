package com.cg.entity.EmployeeCriteria;

import com.cg.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class EmpCriteriaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<EmpDept> r = cq.from(EmpDept.class);

        cq.multiselect(r.get("dept"),cb.count(r));
        cq.groupBy(r.get("dept"));
//        List<EmpDept> li = em.createQuery(cq).getResultList();
//        li.forEach(p-> System.out.println(p));

        TypedQuery<Object[]> typedQuery = em.createQuery(cq);
        List<Object[]> li = typedQuery.getResultList();
        li.forEach(obj->System.out.println("Department: " + obj[0] + " Count: " + obj[1]));

    }
}
