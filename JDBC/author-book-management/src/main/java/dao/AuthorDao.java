package dao;

import bean.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDao implements IAuthorDao {
    private static Connection con;
    static {
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String saveAuthor(Author a) {
        try {
            PreparedStatement ps = con.prepareStatement("insert into author (first_name,middle_name,last_name,phone_no) values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,a.getFirstName());
            ps.setString(2,a.getMiddleName());
            ps.setString(3,a.getLastName());
            ps.setString(4,a.getPhoneNo());

            int rows = ps.executeUpdate();
            if (rows > 0){
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int generatedId = rs.getInt(1);
                    a.setAuthorid(generatedId);
                    return "Author Created.";
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Author Not Created.";
    }

    @Override
    public String updateAuthor(int authorId, String newFirstName,String newMidName, String newLastName) {
        try {
            PreparedStatement ps = con.prepareStatement("update author set first_name=?,middle_name=?,last_name=? where author_id=?");
            ps.setString(1,newFirstName);
            ps.setString(2,newMidName);
            ps.setString(3,newLastName);
            ps.setInt(4,authorId);
            int rows = ps.executeUpdate();
            if (rows > 0)
                return "Author updated";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Author Not Updated";
    }

    @Override
    public List<Author> getAll() {
        try {
            List<Author> li = new ArrayList<>();
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("Select * from author");
            while(rs.next()){
                Author a = new Author(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));
                li.add(a);
            }
            return li;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String deleteAuthor(int authorId) {
        try {
            PreparedStatement ps = con.prepareStatement("delete from author where author_id=?");
            ps.setInt(1,authorId);
            int rows = ps.executeUpdate();
            if (rows > 0)
                return "Author Deleted";
            return "Author Not Found";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Author Not deleted";
    }
}
