package Library.Book;

import Library.Person.Reader;

import java.util.List;

public class Book {

    private Author author;
    private String book_ID;
    private String name;
    private double price;
    private String status;
    private String edition;
    private String date_of_purchase;
    private Category category;


    public Book(Author author, String book_ID, String name, double price, String status, String edition, String date_of_purchase, Category category) {
        this.author = author;
        this.book_ID = book_ID;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.date_of_purchase = date_of_purchase;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBook_ID() {
        return book_ID;
    }

    public void setBook_ID(String book_ID) {
        this.book_ID = book_ID;
    }

    public String get_title() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getDate_of_purchase() {
        return date_of_purchase;
    }

    public void setDate_of_purchase(String date_of_purchase) {
        this.date_of_purchase = date_of_purchase;
    }

    public Reader getOwner(List<Reader> readers) {
        for (Reader reader : readers) {
            if (reader.books.contains(this)) {
                return reader;
            }
        }
        return null;
    }


}
