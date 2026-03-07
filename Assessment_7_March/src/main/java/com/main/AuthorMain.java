package com.main;

import com.dao.AuthorDao;
import java.util.Scanner;

public class AuthorMain {
    public static void main(String[] args) {
        AuthorDao dao = new AuthorDao();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("Library Management System: ");
            System.out.println("1. Insert Author and Books");
            System.out.println("2. Read All Records");
            System.out.println("3. Update Book Price");
            System.out.println("4. Delete Book by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Author Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Author Email: ");
                    String email = sc.nextLine();
                    System.out.println(dao.insert(name, email));
                    break;

                case 2:
                    System.out.print("All authors and their books: ");
                    dao.read();
                    break;

                case 3:
                    System.out.print("Enter Book id to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Price: ");
                    double price = sc.nextDouble();
                    System.out.println(dao.update(id, 0, price));
                    break;

                case 4:
                    System.out.print("Enter Book ID to delete: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.println(dao.delete(bid));
                    break;

                case 5:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}