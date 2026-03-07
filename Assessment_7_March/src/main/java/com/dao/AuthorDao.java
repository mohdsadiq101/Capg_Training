package com.dao;

import com.bean.Author;
import com.bean.Book;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorDao implements IAuthorDao {
    private static EntityManager em;

    static {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        em = emf.createEntityManager();
    }

    @Override
    public String insert(String name, String email) {
        Scanner sc = new Scanner(System.in);
        em.getTransaction().begin();
        Author a = new Author(name, email);
        List<Book> books = new ArrayList<>();

        System.out.println("Enter total nos. of book:");
        int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
            System.out.println("Enter book title:");
            String title = sc.nextLine();
            System.out.println("Enter book price");
            double price = sc.nextDouble();
            sc.nextLine();

            Book book = new Book(title, price, a);
            books.add(book);
        }
            a.setBooks(books);
            em.persist(a);
            em.getTransaction().commit();
            return "Author and Books saved";
    }

    @Override
    public void read() {
        List<Author> li = em.createQuery("Select a from Author a", Author.class).getResultList();
        for (Author a : li) {
            System.out.println(a.getAuthorName());
            System.out.println(a.getAuthorId());
            System.out.println("Books written: ");
            List<Book> books = a.getBooks();
            for (Book b : books) {
                System.out.println(b.getTitle());
            }
        }
    }

    @Override
    public String update(int bookid, double oldPrice, double newPrice) {
        em.getTransaction().begin();
        Book b = em.find(Book.class, bookid);
        if (b != null) {
            em.remove(b);
            em.getTransaction().commit();
            return "Book deleted";
        }
        return "Book not deleted";
    }

    @Override
    public String delete(int bookid) {
        em.getTransaction().begin();
        Book b = em.find(Book.class, bookid);
        if (b != null) {
            em.remove(b);
            em.getTransaction().commit();
            return "Book deleted";
        }
        return "Book not deleted";
  }
}