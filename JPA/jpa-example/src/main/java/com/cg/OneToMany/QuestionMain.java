package com.cg.OneToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class QuestionMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
//        Question q = new Question("What is Java?","H");
//        List<Answer> li = new ArrayList<>();
//        li.add(new Answer("Java is OOP",q));
//        li.add(new Answer("Java is Platform Independent",q));
//        li.add(new Answer("Java is Simple",q));
//        q.setAnswer(li);
//        em.persist(q);
//        em.getTransaction().commit();
//        System.out.println("Created...");

        Question q = em.find(Question.class,52);
        System.out.println(q.getQuesName());
        q.getAnswer().forEach(e -> System.out.println(e.getAnswer()));

        Answer a = em.find(Answer.class,53);
        System.out.println("Answer:");
        System.out.println(a.getAnswer());
        System.out.println("Question:");
        System.out.println(a.getQues().getQuesName());
        em.remove(q);
        em.getTransaction().commit();

    }
}
