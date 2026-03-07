package com.dao;

import java.awt.print.Book;
import java.util.List;

public interface IAuthorDao {
    public String insert(String name, String email);
    public void read();
    public String update(int bookid, double oldPrice, double newPrice);
    public String delete(int bookid);
}
