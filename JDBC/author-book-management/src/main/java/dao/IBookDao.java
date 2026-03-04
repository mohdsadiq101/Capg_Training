package dao;

import bean.Book;

import java.util.List;

public interface IBookDao {
    public List<String> getBooksByAuthor(String firstName);
    public String saveBook(Book b);
    public String updatePriceByAuth(String firstName, double newPrice);
}
