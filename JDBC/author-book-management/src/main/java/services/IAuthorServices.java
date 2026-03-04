package services;

import bean.Author;

import java.util.List;

public interface IAuthorServices {
    public String createAuthor(Author a);
    public String updateAuth(int authid, String fname,String mname, String lname);
    public String deleteAuth(int authid);
    public List<Author> getAllAuth();
}
