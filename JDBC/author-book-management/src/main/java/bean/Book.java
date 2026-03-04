package bean;

public class Book {
    private long isbn;
    private String title;
    private double price;
    private int authorId;

    public Book(long isbn, String title, double price,int authorId) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.authorId = authorId;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}
