package services;

import bean.Author;
import dao.AuthorDao;
import dao.IAuthorDao;

import java.util.List;

public class AuthorServices implements IAuthorServices {
    IAuthorDao dao = new AuthorDao();

    @Override
    public String createAuthor(Author a) {
        if (a.getFirstName() == null || a.getPhoneNo().length() < 10 || a.getPhoneNo() == null)
            return "Invalid Author name or Phone No.";
        return dao.saveAuthor(a);
    }

    @Override
    public String updateAuth(int authid, String fname,String mname, String lname) {
        if (fname == null || fname.length() < 3)
            return "Invalid Name";
        return dao.updateAuthor(authid,fname,mname,lname);
    }

    @Override
    public List<Author> getAllAuth() {
        return dao.getAll();
    }

    @Override
    public String deleteAuth(int authid) {
        if (authid == 0)
            return "Invalid Author ID";
        return dao.deleteAuthor(authid);
    }
}
