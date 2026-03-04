package services;

import bean.Book;
import dao.BookDao;
import dao.IBookDao;

import java.util.List;

public class BookServices implements IBookServices {
    IBookDao dao = new BookDao();

    @Override
    public String addBook(Book b) {
        if (b.getTitle() == null || b.getPrice() < 0 || b.getAuthorId() < 0)
            return "Invalid Book details";
        return dao.saveBook(b);
    }

    @Override
    public List<String> getBooksByAuth(String name) {
        if (name == null)
            return null;
        return dao.getBooksByAuthor(name);
    }

    @Override
    public String updatePrice(String name, double price) {
        if (name == null || price < 0)
            return "Invalid Name or Price";
        return dao.updatePriceByAuth(name,price);
    }
}
