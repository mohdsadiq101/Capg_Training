package dao;

import bean.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao implements IBookDao {
    private static Connection con;
    static {
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String saveBook(Book b) {
        try {
            PreparedStatement ps = con.prepareStatement("insert into book (title,price,author_id) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,b.getTitle());
            ps.setDouble(2,b.getPrice());
            ps.setInt(3,b.getAuthorId()); // foreign key
            int rows = ps.executeUpdate();
            if (rows > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()){
                    long genIsbn = rs.getLong(1);
                    b.setIsbn(genIsbn);
                    return "Book Saved";
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Book Not Saved";
    }

    @Override
    public List<String> getBooksByAuthor(String firstName) {
        List<String> li = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(
                    "select b.title from book b " +
                            "JOIN author a ON b.author_id = a.author_id " +
                            "where a.first_name=?");
            ps.setString(1,firstName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                li.add(rs.getString("title"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return li;
    }

    @Override
    public String updatePriceByAuth(String firstName, double newPrice) {
        try {
            PreparedStatement ps = con.prepareStatement("update book b JOIN author a ON b.author_id = a.author_id set b.price=? where a.first_name=?");
            ps.setDouble(1,newPrice);
            ps.setString(2,firstName);
            int rows = ps.executeUpdate();
            if (rows > 0)
                return "Price Updated";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Price Not Updated";
    }
}
