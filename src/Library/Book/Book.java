package Library.Book;

import Library.Person.Reader;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Book {

    private Author author;
    private String book_ID;
    private String name;
    private double price;
    private String status;
    private String edition;
    private LocalDate date_of_purchase;
    private Category category;


    public Book(Author author, String book_ID, String name, double price, String status, String edition, LocalDate date_of_purchase, Category category) {
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

    public LocalDate getDate_of_purchase() {
        return date_of_purchase;
    }

    public void setDate_of_purchase(LocalDate date_of_purchase) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Double.compare(getPrice(), book.getPrice()) == 0 && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getBook_ID(), book.getBook_ID()) && Objects.equals(getName(), book.getName()) && Objects.equals(getStatus(), book.getStatus()) && Objects.equals(getEdition(), book.getEdition()) && Objects.equals(getDate_of_purchase(), book.getDate_of_purchase()) && getCategory() == book.getCategory();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getBook_ID(), getName(), getPrice(), getStatus(), getEdition(), getDate_of_purchase(), getCategory());
    }
//display metodu yerine Override edilmiş toString
    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", book_ID='" + book_ID + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", edition='" + edition + '\'' +
                ", date_of_purchase=" + date_of_purchase +
                ", category=" + category +
                '}';
    }
}
