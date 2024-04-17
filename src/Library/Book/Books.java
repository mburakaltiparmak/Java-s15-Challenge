package Library.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Books {
    private List<Book> books = new ArrayList<>();

    public Books() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Books)) return false;
        Books books1 = (Books) o;
        return Objects.equals(getBooks(), books1.getBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBooks());
    }

    @Override
    public String toString() {
        return "Books{" +
                "books=" + books +
                '}';
    }
}
