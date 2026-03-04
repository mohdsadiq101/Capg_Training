package dao;

import bean.Author;

import java.util.List;

public interface IAuthorDao {
    public String saveAuthor(Author a);
    public String updateAuthor(int authorId, String newFirstName,String newMidName, String newLastName);
    public String deleteAuthor(int authorId);
    public List<Author> getAll();
}