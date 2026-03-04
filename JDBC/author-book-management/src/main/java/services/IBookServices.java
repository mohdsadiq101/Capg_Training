package services;

import bean.Book;

import java.util.List;

public interface IBookServices {
    public List<String> getBooksByAuth(String name);
    public String addBook(Book b);
    public String updatePrice(String name, double price);
}
