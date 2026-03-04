package pl;

import bean.Author;
import bean.Book;
import services.AuthorServices;
import services.BookServices;
import services.IAuthorServices;
import services.IBookServices;

import java.util.List;
import java.util.Scanner;

public class AuthorMain {
    public static void main(String[] args) {
        IAuthorServices as = new AuthorServices();
        IBookServices bs = new BookServices();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 9){
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add New Author");
            System.out.println("2. Add New Book (Requires Author ID)");
            System.out.println("3. Show Books by Author First Name");
            System.out.println("4. Update Book Price by Author First Name");
            System.out.println("5. Show All Authors");
            System.out.println("6. Display Author Details by ID");
            System.out.println("7. Update Author Details");
            System.out.println("8. Delete Author");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String fName = sc.nextLine();
                    System.out.print("Enter Middle Name: ");
                    String mName = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lName = sc.nextLine();
                    System.out.print("Enter Phone No: ");
                    String phone = sc.nextLine();

                    Author newAuthor = new Author(0, fName, mName, lName, phone);
                    System.out.println(as.createAuthor(newAuthor));
                    break;

                case 2:
                    System.out.print("Enter Author ID for this book: ");
                    int authIdForBook = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Price: ");
                    double price = sc.nextDouble();

                    Book newBook = new Book(0, title, price, authIdForBook);
                    System.out.println(bs.addBook(newBook));
                    break;

                case 3:
                    System.out.print("Enter Author's First Name to search books: ");
                    String searchFName = sc.nextLine();
                    List<String> books = bs.getBooksByAuth(searchFName);

                    if (books != null && !books.isEmpty()) {
                        System.out.println("Books by " + searchFName);
                        for (String s : books) {
                            System.out.println(s);
                        }
                    } else {
                        System.out.println("No books found for author: " + searchFName);
                    }
                    break;

                case 4:
                    System.out.print("Enter Author's First Name to update their book prices: ");
                    String updateFName = sc.nextLine();
                    System.out.print("Enter the New Price: ");
                    double newPrice = sc.nextDouble();

                    System.out.println(bs.updatePrice(updateFName, newPrice));
                    break;

                case 5:
                    List<Author> authors = as.getAllAuth();
                    if (authors != null && !authors.isEmpty()) {
                        System.out.println("All Authors");
                        for (Author a : authors) {
                            System.out.println("ID: " + a.getAuthorid() + " | Name: " + a.getFirstName() + " " + a.getLastName() + " | Phone: " + a.getPhoneNo());
                        }
                    } else {
                        System.out.println("No authors found in the database.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Author ID to view details: ");
                    int searchId = sc.nextInt();
                    List<Author> allAuthors = as.getAllAuth();
                    boolean found = false;

                    if (allAuthors != null) {
                        for (Author a : allAuthors) {
                            if (a.getAuthorid() == searchId) {
                                System.out.println("--- Author Details ---");
                                System.out.println("ID: " + a.getAuthorid());
                                System.out.println("Name: " + a.getFirstName() + " " + a.getMiddleName() + " " + a.getLastName());
                                System.out.println("Phone: " + a.getPhoneNo());
                                found = true;
                                break;
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("Author not found with ID: " + searchId);
                    }
                    break;

                case 7:
                    System.out.print("Enter Author ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New First Name: ");
                    String newFName = sc.nextLine();
                    System.out.print("Enter New Middle Name: ");
                    String newMName = sc.nextLine();
                    System.out.print("Enter New Last Name: ");
                    String newLName = sc.nextLine();

                    System.out.println(as.updateAuth(updateId, newFName, newMName, newLName));
                    break;

                case 8:
                    System.out.print("Enter Author ID to delete: ");
                    int deleteId = sc.nextInt();
                    System.out.println(as.deleteAuth(deleteId));
                    break;

                case 0:
                    System.out.println("Exiting Application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 8.");
            }
        }
        sc.close();
    }
}
